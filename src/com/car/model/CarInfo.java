package com.car.model;

public class CarInfo
{
	private String srialNumber;
	private String brand;
	public CarInfo(String srialNumber, String brand)
	{
		this.srialNumber = srialNumber;
		this.brand = brand;
	}
	@Override
	public String toString() 
	{
		return "CarInfo [srialNumber=" + srialNumber + ", brand=" + brand + "]";
	}
	public String getSrialNumber()
	{
		return srialNumber;
	}
	public void setSrialNumber(String srialNumber) 
	{
		this.srialNumber = srialNumber;
	}
	public String getBrand() 
	{
		return brand;
	}
	public void setBrand(String brand) 
	{
		this.brand = brand;
	}
	
	

}
