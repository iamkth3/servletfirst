package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.*;

public class FirstServlet implements Servlet {

//	life cycle methods

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Going to destroy servlet");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return this.conf;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "This servlet is created by me";
	}

	ServletConfig conf;

	@Override
	public void init(ServletConfig conf) throws ServletException {
		// TODO Auto-generated method stub
		this.conf = conf;
		System.out.println("Creating Object..........");
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Servicing.........");
//		set content type of response
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1> This is output </h1>");
		out.println("<h1> This is output of date "+new Date().toString()+"</h1>");

	}

}
