package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class Generic extends jakarta.servlet.GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("This is servlet using generic servlet");
		resp.setContentType("text/html");
		PrintWriter p = resp.getWriter();
		p.println("<h1> This is my servlet using generic servlet");
		
	}
	
}
