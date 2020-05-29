package com.bookstore.operationsdb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class InsertUser {
	private String url = "jdbc:sqlserver://localhost;database=BookStore";
	private String login = "user";
	private String password = "12345";
	public void create(String inputLogin,String inputPassword,String inputPhoneNumber,String inputSecondName,String inputFirstName) {
		String query = "insert into Users(userName,password,phoneNumber,secondName,firstName) values(?,?,?,?,?)";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").getDeclaredConstructor().newInstance();
			   Connection connectDatabase = DriverManager.getConnection(url,login,password);
			   try {
				   PreparedStatement thisQuery = connectDatabase.prepareStatement(query);
				   thisQuery.setString(1, inputLogin);
				   thisQuery.setString(2, inputPassword);
				   thisQuery.setString(3, inputPhoneNumber);
				   thisQuery.setString(4, inputSecondName);
				   thisQuery.setString(5, inputFirstName);
				   thisQuery.executeUpdate();
			} catch (Exception e) {
				System.out.println(e);
			}
			   finally {
				connectDatabase.close();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("User Created");
		}
	}
	
}
