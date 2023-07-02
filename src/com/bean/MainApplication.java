package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		
		ApplicationContext a = new ClassPathXmlApplicationContext("CricketPlayer.xml");
		
		CricketTeam c = (CricketTeam) a.getBean("t1");
		c.display();

	}

}
