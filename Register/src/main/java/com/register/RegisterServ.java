package com.register;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class Register
 */
public class RegisterServ extends HttpServlet {
	
	protected void processRequest(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException{
		resp.setContentType("text/html");
		try 
			(PrintWriter out = resp.getWriter()){
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet Register</title>");
			out.println("</head>");
			out.println("<body>");
			
			
			String name = req.getParameter("user_name");
			String pass = req.getParameter("user_pass");
			String email = req.getParameter("email");
			
			out.println(name);
			out.println(pass);
			out.println(email);
			
			
			out.println("</body>");
			out.println("</html>");
		}
	}
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		resp.getWriter().append("Served at: ").append(req.getContextPath());
		resp.setContentType("text/html");
		try 
			(PrintWriter out = resp.getWriter()){
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet Register</title>");
			out.println("</head>");
			out.println("<body>");
			
			
			String name = req.getParameter("user_name");
			String pass = req.getParameter("user_pass");
			String email = req.getParameter("email");
			
			out.println(name);
			out.println(pass);
			out.println(email);
			
			
			
			//connection
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","krishna");
				
				String q = "insert into user1(name,password,email) values(?,?,?)";
				
				PreparedStatement ps = con.prepareStatement(q);
				ps.setString(1, name);
				ps.setString(2, pass);
				ps.setString(3, email);
				
				ps.executeUpdate();
				
				out.println("<h2>Done.........</h2>");
				
				
				
			}
			catch(Exception e) {
				e.printStackTrace();
				out.println("<h2>error....</h2>");
			}
			
			out.println("</body>");
			out.println("</html>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
