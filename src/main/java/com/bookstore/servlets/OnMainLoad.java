package com.bookstore.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import com.bookstore.db.*;
import com.bookstore.operationsdb.*;
import javax.servlet.annotation.*;

@WebServlet("")
public class OnMainLoad extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String loginSession = (String) session.getAttribute("loginSession");
		if (loginSession != null) {	
		request.setAttribute("loginSession", loginSession);
		SelectUsers selectUsers = new SelectUsers();
		ArrayList<Users> users = selectUsers.getUsersbyLogin(loginSession);
		int permission = users.get(0).getPermission();
		request.setAttribute("permission", permission);
		}
		else {
			
		}
		SelectBook selectBook = new SelectBook();
		ArrayList<Products> products = selectBook.getBooks();
		request.setAttribute("books", products);
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
