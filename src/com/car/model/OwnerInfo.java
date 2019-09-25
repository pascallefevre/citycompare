package com.car.model;

public class OwnerInfo 
{
private String firstName;
private String lastName;
public OwnerInfo(String firstName, String lastName) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
}
@Override
public String toString() {
	return "OwnerInfo [firstName=" + firstName + ", lastName=" + lastName + "]";
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


}
