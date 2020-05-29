package com.bookstore.operationsdb;
import com.bookstore.db.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class SelectBook {
	private String url = "jdbc:sqlserver://localhost;database=BookStore";
	private String login = "user";
	private String password = "12345";
	public ArrayList<Products> getBookbyArticule(String inputArticule){
		ArrayList<Products> arrayBook = new ArrayList<Products>();
		String query = "select * from Products where articule = ?";
		try {
		   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").getDeclaredConstructor().newInstance();
		   Connection connectDatabase = DriverManager.getConnection(url,login,password);
		   try {
			PreparedStatement thisQuery = connectDatabase.prepareStatement(query);
			thisQuery.setString(1, inputArticule);
			ResultSet queryResult = thisQuery.executeQuery();
			while (queryResult.next()) {
			int productsId = queryResult.getInt(1); 
			String articule = queryResult.getString(2);
			double price = queryResult.getDouble(3);
			String name = queryResult.getString(4);
			String type = queryResult.getString(5);
			int providerId = queryResult.getInt(6); 
			String genre = queryResult.getString(7);
			int pages = queryResult.getInt(8); 
			Products products = new Products(productsId, articule, price, name, type, providerId, genre, pages);
			arrayBook.add(products);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		   finally {
			connectDatabase.close(); 
		}
		} catch (Exception e) { 
			System.out.println(e);
		} finally {
			System.out.println ("Book find successful by articule");
		}
		return arrayBook;
	}
	public ArrayList<Products> getBooks(){
		ArrayList<Products> arrayBook = new ArrayList<Products>();
		String query = "select * from Products";
		try {
		   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").getDeclaredConstructor().newInstance();
		   Connection connectDatabase = DriverManager.getConnection(url,login,password);
		   try {
			PreparedStatement thisQuery = connectDatabase.prepareStatement(query);
			ResultSet queryResult = thisQuery.executeQuery();
			while (queryResult.next()) {
			int productsId = queryResult.getInt(1); 
			String articule = queryResult.getString(2);
			double price = queryResult.getDouble(3);
			String name = queryResult.getString(4);
			String type = queryResult.getString(5);
			int providerId = queryResult.getInt(6); 
			String genre = queryResult.getString(7);
			int pages = queryResult.getInt(8); 
			Products products = new Products(productsId, articule, price, name, type, providerId, genre, pages);
			arrayBook.add(products);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		   finally {
			connectDatabase.close(); 
		}
		} catch (Exception e) { 
			System.out.println(e);
		} finally {
			System.out.println ("Books find successful");
		}
		return arrayBook;
	}
}