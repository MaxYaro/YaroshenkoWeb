package com.bookstore.db;
import java.io.Serializable;
public class Orders implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int orderId;
	private int userId;
	private String address;
	private String paymentType;
	/**
	 * 
	 */
	public Orders() {
		super();
	}
	/**
	 * @param userId
	 * @param address
	 * @param paymentType
	 */
	public Orders(int userId, String address, String paymentType) {
		super();
		this.userId = userId;
		this.address = address;
		this.paymentType = paymentType;
	}
	/**
	 * @param orderId
	 * @param userId
	 * @param address
	 * @param paymentType
	 */
	public Orders(int orderId, int userId, String address, String paymentType) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.address = address;
		this.paymentType = paymentType;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public int getOrderId() {
		return orderId;
	}

}
