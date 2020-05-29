package com.bookstore.db;
import java.io.Serializable;
public class Products implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int productsId;
	private String articule;
	private double price;
	private String name;
	private String type;
	private int providerId;
	private String genre;
	private int pages;
	/**
	 * 
	 */
	public Products() {
		super();
	}
	/**
	 * @param articule
	 * @param price
	 * @param name
	 * @param type
	 * @param providerId
	 * @param genre
	 * @param pages
	 */
	public Products(String articule, double price, String name, String type, int providerId, String genre, int pages) {
		super();
		this.articule = articule;
		this.price = price;
		this.name = name;
		this.type = type;
		this.providerId = providerId;
		this.genre = genre;
		this.pages = pages;
	}
	/**
	 * @param productsId
	 * @param articule
	 * @param price
	 * @param name
	 * @param type
	 * @param providerId
	 * @param genre
	 * @param pages
	 */
	public Products(int productsId, String articule, double price, String name, String type, int providerId,
			String genre, int pages) {
		super();
		this.productsId = productsId;
		this.articule = articule;
		this.price = price;
		this.name = name;
		this.type = type;
		this.providerId = providerId;
		this.genre = genre;
		this.pages = pages;
	}
	public String getArticule() {
		return articule;
	}
	public void setArticule(String articule) {
		this.articule = articule;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getProviderId() {
		return providerId;
	}
	public void setProviderId(int providerId) {
		this.providerId = providerId;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public int getProductsId() {
		return productsId;
	}
}
