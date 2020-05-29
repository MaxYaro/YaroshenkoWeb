package com.bookstore.operationsdb;
import com.bookstore.db.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
public class SelectUsers {
	private String url = "jdbc:sqlserver://localhost;database=BookStore";
	private String login = "user";
	private String password = "12345";
	public ArrayList<Users> getUsersbyLogin(String inputLogin){
		ArrayList<Users> arrayUsers = new ArrayList<Users>();
		String query = "select * from Users where UserName = ?";
		try {
		   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").getDeclaredConstructor().newInstance();
		   Connection connectDatabase = DriverManager.getConnection(url,login,password);
		   try {
			PreparedStatement thisQuery = connectDatabase.prepareStatement(query);
			thisQuery.setString(1, inputLogin);
			ResultSet queryResult = thisQuery.executeQuery();
			while (queryResult.next()) {
			int userId = queryResult.getInt(1); 
			String userName = queryResult.getString(2);
			String password = queryResult.getString(3);
			String phoneNumber = queryResult.getString(4);
			String secondName = queryResult.getString(5);
			String firstName = queryResult.getString(6);
			int permission = queryResult.getInt(7);
			Users users = new Users(userId,userName,password,phoneNumber,secondName,firstName,permission);
			arrayUsers.add(users);
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
			System.out.println("User find successful by login");
		}
		return arrayUsers;
	}
	public ArrayList<Users> getUsersbyPhoneNumber(String inputNumber){
		ArrayList<Users> arrayUsers = new ArrayList<Users>();
		String query = "select * from Users where phoneNumber = ?";
		try {
		   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").getDeclaredConstructor().newInstance();
		   Connection connectDatabase = DriverManager.getConnection(url,login,password);
		   try {
			PreparedStatement thisQuery = connectDatabase.prepareStatement(query);
			thisQuery.setString(1, inputNumber);
			ResultSet queryResult = thisQuery.executeQuery();
			while (queryResult.next()) {
			int userId = queryResult.getInt(1); 
			String userName = queryResult.getString(2);
			String password = queryResult.getString(3);
			String phoneNumber = queryResult.getString(4);
			String secondName = queryResult.getString(5);
			String firstName = queryResult.getString(6);
			int permission = queryResult.getInt(7);
			Users users = new Users(userId,userName,password,phoneNumber,secondName,firstName,permission);
			arrayUsers.add(users);
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
			System.out.println("User find successful by login");
		}
		return arrayUsers;
	}
	public ArrayList<Users> getUsersbyId(int inputId){
		ArrayList<Users> arrayUsers = new ArrayList<Users>();
		String query = "select * from Users where UserId = ?";
		try {
		   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").getDeclaredConstructor().newInstance();
		   Connection connectDatabase = DriverManager.getConnection(url,login,password);
		   try {
			PreparedStatement thisQuery = connectDatabase.prepareStatement(query);
			thisQuery.setInt(1, inputId);
			ResultSet queryResult = thisQuery.executeQuery();
			while (queryResult.next()) {
			int userId = queryResult.getInt(1); 
			String userName = queryResult.getString(2);
			String password = queryResult.getString(3);
			String phoneNumber = queryResult.getString(4);
			String secondName = queryResult.getString(5);
			String firstName = queryResult.getString(6);
			int permission = queryResult.getInt(7);
			Users users = new Users(userId,userName,password,phoneNumber,secondName,firstName,permission);
			arrayUsers.add(users);
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
			System.out.println("User find successful by login");
		}
		return arrayUsers;
	}
	
			
}
