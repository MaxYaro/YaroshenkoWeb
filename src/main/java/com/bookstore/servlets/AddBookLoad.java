package com.bookstore.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bookstore.db.Provider;
import com.bookstore.db.Users;
import com.bookstore.operationsdb.SelectProvider;
import com.bookstore.operationsdb.SelectUsers;

public class AddBookLoad extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String login = (String) session.getAttribute("loginSession");
		SelectUsers selectUsers = new SelectUsers();
		if (login!= null) {
			ArrayList<Users> users = selectUsers.getUsersbyLogin(login);
			int permission = users.get(0).getPermission();
			if (permission == 1) {
				SelectProvider selectProvider = new SelectProvider();
				ArrayList<Provider> providers = selectProvider.getProviders();
				request.setAttribute("providerList", providers);
				request.getRequestDispatcher("/addBook.jsp").forward(request, response);
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
