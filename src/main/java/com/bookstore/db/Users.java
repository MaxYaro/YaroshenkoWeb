package com.bookstore.db;
import java.io.Serializable;
public class Users implements Serializable {

	public Users() {
		super();
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int userId;
	private String userName;
	private String password;
	private String phoneNumber;
	private String secondName;
	private String firstName;
	private int permission;
	/**
	 * @param userName
	 * @param phoneNumber
	 * @param secondName
	 * @param firstName
	 * @param permission
	 */
	public Users(String userName,String password, String phoneNumber, String secondName, String firstName, int permission) {
		super();
		this.userName = userName;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.secondName = secondName;
		this.firstName = firstName;
		this.permission = permission;
	}
	/**
	 * @param userId
	 * @param userName
	 * @param phoneNumber
	 * @param secondName
	 * @param firstName
	 * @param permission
	 */
	public Users(int userId, String userName,String password, String phoneNumber, String secondName, String firstName, int permission) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.secondName = secondName;
		this.firstName = firstName;
		this.permission = permission;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getPermission() {
		return permission;
	}
	public void setPermission(int permission) {
		this.permission = permission;
	}
	public int getUserId() {
		return userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
    