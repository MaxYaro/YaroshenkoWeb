package com.bookstore.operationsdb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class InsertProvider {
	private String url = "jdbc:sqlserver://localhost;database=BookStore";
	private String login = "user";
	private String password = "12345";
	public void create(String inputSite,String inputPhoneNumber,String inputAdress,String inputName) {
		String query = "insert into Provider(site,phoneNumber,adress,name) values(?,?,?,?)";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").getDeclaredConstructor().newInstance();
			   Connection connectDatabase = DriverManager.getConnection(url,login,password);
			   try {
				   PreparedStatement thisQuery = connectDatabase.prepareStatement(query);
				   thisQuery.setString(1, inputSite);
				   thisQuery.setString(2, inputPhoneNumber);
				   thisQuery.setString(3, inputAdress);
				   thisQuery.setString(4, inputName);
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
			System.out.println("Provider Created");
		}
	}
	
}
