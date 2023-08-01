package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ThirdServHttp extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse resp)throws IOException,ServletException{
		System.out.println("This is get method. .........");
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1>This is get method of servlet<h1>");
	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
