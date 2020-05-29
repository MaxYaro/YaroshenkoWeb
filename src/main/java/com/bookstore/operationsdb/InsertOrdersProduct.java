package com.bookstore.operationsdb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertOrdersProduct {
	private String url = "jdbc:sqlserver://localhost;database=BookStore";
	private String login = "user";
	private String password = "12345";
	public void create(int inputOrderId,int inputProductsId) {
		String query = "insert into OrdersProduct(orderId,productsID) values(?,?)";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").getDeclaredConstructor().newInstance();
			   Connection connectDatabase = DriverManager.getConnection(url,login,password);
			   try {
				   PreparedStatement thisQuery = connectDatabase.prepareStatement(query);
				   thisQuery.setInt(1, inputOrderId);
				   thisQuery.setInt(2, inputProductsId);
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
			System.out.println("OrdersProduct Created");
		}
	}
	
}