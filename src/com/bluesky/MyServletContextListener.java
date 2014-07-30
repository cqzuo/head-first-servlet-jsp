package com.bluesky;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		// TODO Auto-generated method stub
		ServletContext ctx = event.getServletContext();
		String dogBreed = ctx.getInitParameter("breed");
		Dog d = new Dog(dogBreed);
		ctx.setAttribute("dog", d);
		System.out.println("1111");
	}

}
