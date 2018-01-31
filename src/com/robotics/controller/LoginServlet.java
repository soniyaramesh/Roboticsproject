package com.robotics.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Email= request.getParameter("email");
		String Password= request.getParameter("password");
		
		if(Email.equals("s@gmail.com")&&Password.equals("1234"))
				{
			
			HttpSession session= request.getSession();
			session.setAttribute("useremail", Email);
			
			response.sendRedirect("type.jsp");
				}
		else
		{
			response.sendRedirect("home.jsp");
		}
	}

	

}
