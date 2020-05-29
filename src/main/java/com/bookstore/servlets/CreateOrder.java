package com.bookstore.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bookstore.db.Users;
import com.bookstore.operationsdb.InsertOrders;
import com.bookstore.operationsdb.InsertOrdersProduct;
import com.bookstore.operationsdb.SelectUsers;

public class CreateOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
   
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String loginSession = (String) session.getAttribute("loginSession");
		String[] productId = request.getParameterValues("checked");
		String adress = request.getParameter("adress");
		String paymentType = request.getParameter("paymentType");
		SelectUsers selectUsers = new SelectUsers();
		InsertOrders insertOrders = new InsertOrders();
		InsertOrdersProduct insertOrdersProduct = new InsertOrdersProduct();
		ArrayList<Users> users = selectUsers.getUsersbyLogin(loginSession);
		int userId = users.get(0).getUserId();
		int orderId = insertOrders.create(userId, adress, paymentType);
		for (String s : productId) {
			insertOrdersProduct.create(orderId, Integer.parseInt(s));
		}
		response.sendRedirect("/bookstore/");
	
	}

}
