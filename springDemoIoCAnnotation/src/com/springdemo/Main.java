package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {

	public static void main(String[] args) {
	//Annotation bazlı injection
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(IocConfig.class);//xml yerine class config kullandık
	ICustomerService customerService = context.getBean("service",ICustomerService.class);
	//context.refresh(); context değiştiği zaman kullanılabiliyor.
	customerService.add();
	
		
	

	}
	//IoC - Inversion of Control
	//Dependency Injection
}
