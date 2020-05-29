package com.bookstore.db;
import java.io.Serializable;
public class Provider implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int providerId;
	private String site;
	private String phoneNumber;
	private String adress;
	private String name;
	/**
	 * 
	 */
	public Provider() {
		super();
	}
	/**
	 * @param site
	 * @param phoneNumber
	 * @param adress
	 * @param name
	 */
	public Provider(String site, String phoneNumber, String adress, String name) {
		super();
		this.site = site;
		this.phoneNumber = phoneNumber;
		this.adress = adress;
		this.name = name;
	}
	/**
	 * @param providerId
	 * @param site
	 * @param phoneNumber
	 * @param adress
	 * @param name
	 */
	public Provider(int providerId, String site, String phoneNumber, String adress, String name) {
		super();
		this.providerId = providerId;
		this.site = site;
		this.phoneNumber = phoneNumber;
		this.adress = adress;
		this.name = name;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getProviderId() {
		return providerId;
	}
}
