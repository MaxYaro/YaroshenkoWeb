package com.bookstore.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookstore.db.Users;
import com.bookstore.operationsdb.InsertUser;
import com.bookstore.operationsdb.SelectUsers;

public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		String repeatPassword = request.getParameter("repeatPassword");
		String phoneNumber = request.getParameter("phoneNumber");
		String secondName = request.getParameter("secondName");
		String firstName = request.getParameter("firstName");
		SelectUsers selectUsers = new SelectUsers();
		InsertUser insertUser = new InsertUser();
		ArrayList<Users> usersByLogin = selectUsers.getUsersbyLogin(login);
		ArrayList<Users> usersByPhoneNumber = selectUsers.getUsersbyPhoneNumber(phoneNumber);
		try {
			if (login.length() >= 8 ) {
				if (password.length() >= 8) {
					if (usersByPhoneNumber.size() == 0 ) {
						if (password.equals(repeatPassword)) {
							if (usersByLogin.size() == 0) {
								insertUser.create(login, password, phoneNumber, secondName, firstName);
								response.sendRedirect("/bookstore/RegistrationSuccessful");
							}
							else {
								response.sendRedirect("/bookstore/UserExist");
							}
						}
						else {
							response.sendRedirect("/bookstore/PasswordMismatch");
						}
					}
					else {
						response.sendRedirect("/bookstore/PhoneExsist");
					}
				}
				else {
					response.sendRedirect("/bookstore/PasswordLength");
				}
			}
			else {
				response.sendRedirect("/bookstore/LoginLength");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
