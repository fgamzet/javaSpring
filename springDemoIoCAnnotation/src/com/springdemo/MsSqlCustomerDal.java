package com.springdemo;

import org.springframework.beans.factory.annotation.Value;

/*
import org.springframework.stereotype.Component;
@Component("database")
bunun yerine IocConfig dosyasının içinde bean tanımı yapmak daha iyi olacak. 
*
*/
public class MsSqlCustomerDal implements ICustomerDal{
	@Value("${database.connectionString}")
	String connectionString;
	public String getConnectionString() {
		return connectionString;
	}
	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	@Override
	public void add() {
		System.out.println("Connection String: " + this.connectionString);
		System.out.println("Ms Sql veritabanına eklendi");
		
	}

}
