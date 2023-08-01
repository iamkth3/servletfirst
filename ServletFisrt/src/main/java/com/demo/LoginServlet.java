package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/login", name = "LoginServlet")
public class LoginServlet extends HttpServlet {

	

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Login servlet works");
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>From Servlet <h1>");
		String name = "testing";
		writer.println(name);
		super.doGet(req, resp);
	}

}
