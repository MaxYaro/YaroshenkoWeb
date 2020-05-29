package com.bookstore.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bookstore.db.Users;
import com.bookstore.operationsdb.SelectUsers;

public class SignIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		SelectUsers selectUsers = new SelectUsers();
		ArrayList<Users> users = selectUsers.getUsersbyLogin(login);
		HttpSession session = request.getSession();
		try {
			if (users.size() > 0) {
			if (password.equals(users.get(0).getPassword())) {
				session.setAttribute("loginSession", login);
				response.sendRedirect("/bookstore/SuccesfulSignIn");
			}
			else {
				response.sendRedirect("/bookstore/WrongLoginOrPassword");
			}
			}
			else {
				response.sendRedirect("/bookstore/WrongLoginOrPassword");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
