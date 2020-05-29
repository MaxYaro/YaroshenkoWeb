package com.bookstore.operationsdb;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InsertOrders {
	private String url = "jdbc:sqlserver://localhost;database=BookStore";
	private String login = "user";
	private String password = "12345";
	public int create(int inputUserId,String inputAdress,String inputpaymentType) {
		String query = "insert into Orders(userId,adress,paymentType) values(?,?,?)";
		String getQuery = "select top 1 * from Orders order by OrderId desc";
		int currentOrderId = 0;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").getDeclaredConstructor().newInstance();
			   Connection connectDatabase = DriverManager.getConnection(url,login,password);
			   try {
				   PreparedStatement thisQuery = connectDatabase.prepareStatement(query);
				   thisQuery.setInt(1, inputUserId);
				   thisQuery.setString(2, inputAdress);
				   thisQuery.setString(3, inputpaymentType);
				   thisQuery.executeUpdate();
				   Statement statement = connectDatabase.createStatement();
				   ResultSet resultSet = statement.executeQuery(getQuery);
				   while (resultSet.next()) {
					currentOrderId = resultSet.getInt(1);
				}
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
			System.out.println("Order Created");
		}
		return currentOrderId;
	}
	
}