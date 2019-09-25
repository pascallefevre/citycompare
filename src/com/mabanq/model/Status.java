package com.mabanq.model;

public class Status {
	
	private boolean manager = false;
	private int year;
	
	public Status(boolean manager, int year) {
		super();
		this.manager = manager;
		this.year = year;
	}
	
	
	
	public Status(int year) {
		super();
		this.year = year;
	}








	//Getteur et setteur
	public boolean isManager() {
		return manager;
	}

	public void setManager(boolean manager) {
		this.manager = manager;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	

}
