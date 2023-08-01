package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class S2 extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	
	resp.setContentType("text/html");
	PrintWriter out = resp.getWriter();
	
	String n1 = req.getParameter("n1");
	String n2 = req.getParameter("n2");
	
	int nn1 = Integer.parseInt(n1);
	int nn2 = Integer.parseInt(n2);
	
	int p = nn1*nn2;
	
	int sum = (int)req.getAttribute("sum");
	
	out.println("<h1>dikhao sum<h1>"+sum);
	out.println("<h1>dikhao product<h1>"+p);
	
//	super.doGet(req, resp);
}





}