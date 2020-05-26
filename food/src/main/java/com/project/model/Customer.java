package com.project.model;

public class Customer {

	public Customer(String userName, String address, String phoneNumber, String password, String item, int quantity) {
		super();
		this.userName = userName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.item = item;
		this.quantity = quantity;
	}
	public Customer() {
		super();
	}
	
	private String userName;
	private String address;
	private String phoneNumber;
	private String password;
	private String item;
	private int quantity;
	
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Customer [userName=" + userName + ", address=" + address + ", phoneNumber=" + phoneNumber
				+ ", password=" + password + ", item=" + item + ", quantity=" + quantity + "]";
	}
	
	
	
}
