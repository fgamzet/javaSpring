package com.hibernatedemo;
import java.util.List;

import javax.sound.midi.MidiSystem;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class Main {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(City.class)
				.buildSessionFactory();
		//Unit of Work
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			//HQL--> Hibernate Query Language
			//Select * from city
			//from City c where c.countryCode='TUR' OR c.countryCode='USA'
			//from City c where c.name LIKE '%kar%'
			//from City c ORDER BY c.name DESC   default--> ASC
			/*
			 * List<String> countryCodes = session.
			 * createQuery("select c.countryCode from City c GROUP BY c.countryCode ").
			 * getResultList(); for(String countryCode:countryCodes) {
			 * System.out.println(countryCode); }
			 */
			
			//INSERT
			/*
			 * City city = new City(); city.setName("Düzce 10"); city.setCountryCode("TUR");
			 * city.setDistrict("Karadeniz"); city.setPopulation(1000000);
			 * session.save(city);
			 */
			
			//UPDATE
			/*
			 * City city = session.get(City.class, 4114); city.setPopulation(1100000);
			 * session.save(city); System.out.println("Şehir güncellendi");
			 */
			//CRUD Create Read Update Delete
			
			//DELETE
			/*
			 * City city = session.get(City.class, 4114); session.delete(city);
			 */
			//createQuery ile de sorgumuzu yazıp getResultList() yerine executeUpdate() yazıp işlem yapabilirdik
			
			
			session.getTransaction().commit();
			
		}
		finally {
			factory.close();
		}

	}

}
