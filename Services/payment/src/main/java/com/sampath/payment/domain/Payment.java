package com.sampath.payment.domain;

public class Payment {
	private String number;
	private String name;
	private String exday;
	private int cvv;
	private double price;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getExday() {
		return exday;
	}
	public void setExday(String exday) {
		this.exday = exday;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void print() {
		System.out.println("number : "+this.number);
		System.out.println("name : "+this.name);
		System.out.println("exday : "+this.exday);
		System.out.println("cvv : "+this.cvv);
		System.out.println("price : "+this.price);
	}
	
}
