package com.bookstore.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PasswordLength extends HttpServlet {
	private static final long serialVersionUID = 1L;
 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean passwordLength = true;
		request.setAttribute("passwordLength", passwordLength);
		request.getRequestDispatcher("/register.jsp").forward(request, response);
	}
	}