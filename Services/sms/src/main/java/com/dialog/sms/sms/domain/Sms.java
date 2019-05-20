package com.dialog.sms.sms.domain;

public class Sms {
	private String no;
	private String massage;
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getMassage() {
		return massage;
	}
	public void setMassage(String massage) {
		this.massage = massage;
	}
	
	public void print() {
		System.out.println("Phone no : "+this.no);
		System.out.println("Message : "+this.massage);
	}
	
}
