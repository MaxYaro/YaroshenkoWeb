package com.bookstore.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookstore.db.Products;
import com.bookstore.operationsdb.SelectBook;


public class Show extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SelectBook selectBook = new SelectBook();
		String articule = request.getParameter("articule");
		ArrayList<Products> products = selectBook.getBookbyArticule(articule);
		request.setAttribute("books", products);
		request.getRequestDispatcher("/show.jsp").forward(request, response);
				
	}

}
