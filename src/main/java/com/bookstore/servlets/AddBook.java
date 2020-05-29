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
import com.bookstore.operationsdb.InsertProducts;
import com.bookstore.operationsdb.SelectProvider;
import com.bookstore.operationsdb.SelectUsers;

public class AddBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
				String articule = request.getParameter("articule");
				double price = Double.parseDouble(request.getParameter("price"));
				String name = request.getParameter("name");
				String type = request.getParameter("type");
				String genre = request.getParameter("genre");
				int pages = Integer.parseInt(request.getParameter("pages"));
				int providerId = Integer.parseInt(request.getParameter("providerId"));
				InsertProducts insertProducts = new InsertProducts();
				insertProducts.create(providerId, articule, price, name, type, genre, pages);
				response.sendRedirect("/bookstore/AddBookLoad");
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
