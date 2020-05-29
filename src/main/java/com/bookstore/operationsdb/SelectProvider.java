package com.bookstore.operationsdb;
import com.bookstore.db.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class SelectProvider {
	private String url = "jdbc:sqlserver://localhost;database=BookStore";
	private String login = "user";
	private String password = "12345";
	public ArrayList<Provider> getProvidersbyId(int inputProviderId){
		ArrayList<Provider> arrayProvider = new ArrayList<Provider>();
		String query = "select * from Provider where providerId = ?";
		try {
		   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").getDeclaredConstructor().newInstance();
		   Connection connectDatabase = DriverManager.getConnection(url,login,password);
		   try {
			PreparedStatement thisQuery = connectDatabase.prepareStatement(query);
			thisQuery.setInt(1, inputProviderId);
			ResultSet queryResult = thisQuery.executeQuery();
			while (queryResult.next()) {
			int providerId = queryResult.getInt(1); 
			String site = queryResult.getString(2);
			String phoneNumber = queryResult.getString(3);
			String adress = queryResult.getString(4);
			String name = queryResult.getString(5);
			Provider provider = new Provider(providerId,site,phoneNumber,adress,name);
			arrayProvider.add(provider);
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
			System.out.println("Provider find successful by id");
		}
		return arrayProvider;
	}
	public ArrayList<Provider> getProviders(){
		ArrayList<Provider> arrayProvider = new ArrayList<Provider>();
		String query = "select * from Provider";
		try {
		   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").getDeclaredConstructor().newInstance();
		   Connection connectDatabase = DriverManager.getConnection(url,login,password);
		   try {
			PreparedStatement thisQuery = connectDatabase.prepareStatement(query);
			ResultSet queryResult = thisQuery.executeQuery();
			while (queryResult.next()) {
			int providerId = queryResult.getInt(1); 
			String site = queryResult.getString(2);
			String phoneNumber = queryResult.getString(3);
			String adress = queryResult.getString(4);
			String name = queryResult.getString(5);
			Provider provider = new Provider(providerId,site,phoneNumber,adress,name);
			arrayProvider.add(provider);
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
			System.out.println("Providers find successful");
		}
		return arrayProvider;
	}
}