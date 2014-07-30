package com.bluesky;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListenerTester extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException
	{
		Dog dog = (Dog) getServletContext().getAttribute("dog");
		System.out.println(dog.getBreed());
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		System.out.println("aaaa");
		Dog dog = (Dog) getServletContext().getAttribute("dog");
		System.out.println(dog.getBreed());
	}
}
