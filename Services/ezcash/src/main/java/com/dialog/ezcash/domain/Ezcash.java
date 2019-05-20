package com.dialog.ezcash.domain;

public class Ezcash {
	private String number;
	private int pin ;
	private double price;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void print() {
		System.out.println("number : "+this.number);
		System.out.println("pin : "+this.pin);
		System.out.println("price : "+this.price);
	}
}
