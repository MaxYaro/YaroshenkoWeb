package com.bookstore.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bookstore.db.Users;
import com.bookstore.operationsdb.InsertProvider;
import com.bookstore.operationsdb.SelectUsers;


public class AddProvider extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String login = (String) session.getAttribute("loginSession");
		SelectUsers selectUsers = new SelectUsers();
		if (login!= null) {
			ArrayList<Users> users = selectUsers.getUsersbyLogin(login);
			int permission = users.get(0).getPermission();
			if (permission == 1) {
				String site = request.getParameter("site");
				String phoneNumber = request.getParameter("phoneNumber");
				String adress = request.getParameter("adress");
				String name = request.getParameter("name");
				InsertProvider insertProvider = new InsertProvider();
				insertProvider.create(site, phoneNumber, adress, name);
				response.sendRedirect("/bookstore/addProvider.jsp");
			}
			else {
				response.sendRedirect("/bookstore/");
			}
		}
		else {
			response.sendRedirect("/bookstore/login.jsp");
		}
	}

}
