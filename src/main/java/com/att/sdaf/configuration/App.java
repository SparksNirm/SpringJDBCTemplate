package com.att.sdaf.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.att.sdaf.dao.CustomerDAO;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = 
	    		new ClassPathXmlApplicationContext("Spring-Module.xml");
		
		CustomerDAO dao=(CustomerDAO) context.getBean("customerDAO");
		
		dao.insertData("NirmalPanchal", "779781", "9869669890");
		
	}
	
	
	
}
