package com.mabanq.model;

public class Employee 
{
	
	private int id;
	private String  firstName;
	private  String lastName;
	private int salary;
	
	private Bankinfo b;
	private Status s;
	
	
	private static int count=0;
	
	
	
	
	
	
	
	public Employee( String firstName, String lastName, int salary, Bankinfo b, Status s) {
		++this.count;
		this.id = count;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.b = b;
		this.s = s;
	}




	
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ ", b=" + b + ", s=" + s + "]";
	}






















	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
