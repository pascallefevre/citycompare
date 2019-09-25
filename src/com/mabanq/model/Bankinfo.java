package com.mabanq.model;

public class Bankinfo 
{

	
	
	private String number;
	private String bankName;
	
	public Bankinfo(String number, String bankName) {
		
		this.number = number;
		this.bankName = bankName;
	}

	@Override
	public String toString() {
		return "Bankinfo [number=" + number + ", bankName=" + bankName + "]";
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
