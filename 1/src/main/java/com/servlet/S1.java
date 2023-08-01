package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class S1 extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	
	resp.setContentType("text/html");
	PrintWriter out = resp.getWriter();
	
	String n1 = req.getParameter("n1");
	String n2 = req.getParameter("n2");
	
	int nn1 = Integer.parseInt(n1);
	int nn2 = Integer.parseInt(n2);
	
	int s = nn1+nn2;
	
	req.setAttribute("sum", s);
	
	RequestDispatcher rd = req.getRequestDispatcher("s2");
	
	rd.forward(req, resp);
//	super.doGet(req, resp);
}






}
