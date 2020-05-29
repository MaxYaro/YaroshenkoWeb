package com.bookstore.db;
import java.io.Serializable;
public class OrdersProduct implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int orderId;
	private int productsId;
	/**
	 * 
	 */
	public OrdersProduct() {
		super();
	}
	/**
	 * @param orderId
	 * @param productsId
	 */
	public OrdersProduct(int orderId, int productsId) {
		super();
		this.orderId = orderId;
		this.productsId = productsId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getProductsId() {
		return productsId;
	}
	public void setProductsId(int productsId) {
		this.productsId = productsId;
	}
}
