package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{

	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("started");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1> Welcome to httpservlet in html <h1>");
		String name = req.getParameter("username");
		String pass = req.getParameter("password");
		String email = req.getParameter("email");
		String gender = req.getParameter("gender");
		String course = req.getParameter("course");
		String condition = req.getParameter("condition");
		
		if(condition!=null) {
		if(condition.equals("checked")) {
			out.println("<h2>Name : "+name+"<h2>");
			out.println("<h2>Password : "+pass+"<h2>");
			out.println("<h2>Email : "+email+"<h2>");
			out.println("<h2>Gender : "+gender+"<h2>");
			out.println("<h2>Course : "+course+"<h2>");
			
			
			
			
			
			
			RequestDispatcher rd  = req.getRequestDispatcher("success");
			rd.forward(req, resp);
			
		}
		else {
			out.println("<h2>You have not agree T&D<h2>");
		}
		}
		else {
			out.println("<h2>You have not agree T&D<h2>");
		}
//		super.doPost(req, resp);
		
		RequestDispatcher rd = req.getRequestDispatcher("index.html");
		
		rd.include(req, resp);
	}

}
