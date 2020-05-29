package com.bookstore.operationsdb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertProducts {
	private String url = "jdbc:sqlserver://localhost;database=BookStore";
	private String login = "user";
	private String password = "12345";
	public void create(int inputProviderId,String inputArticule,double inputPrice,String inputName,String inputType,String inputGenre,int inputPages) {
		String query = "insert into Products(articule,price,name,type,providerId,genre,pages) values(?,?,?,?,?,?,?)";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").getDeclaredConstructor().newInstance();
			   Connection connectDatabase = DriverManager.getConnection(url,login,password);
			   try {
				   PreparedStatement thisQuery = connectDatabase.prepareStatement(query);
				   thisQuery.setString(1, inputArticule);
				   thisQuery.setDouble(2, inputPrice);
				   thisQuery.setString(3, inputName);
				   thisQuery.setString(4, inputType);
				   thisQuery.setInt(5, inputProviderId);
				   thisQuery.setString(6, inputGenre);
				   thisQuery.setInt(7, inputPages);
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
			System.out.println("Product Created");
		}
	}
	
}
