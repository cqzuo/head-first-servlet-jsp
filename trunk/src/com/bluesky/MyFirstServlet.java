package com.bluesky;
import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;

public class MyFirstServlet extends HttpServlet{

	/**
	 * 
	 */
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
				throws IOException
	{
		String color = request.getParameter("color");
		System.out.println(color);
	}
}
