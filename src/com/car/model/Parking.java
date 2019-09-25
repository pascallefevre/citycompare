package com.car.model;

import java.util.ArrayList;

public class Parking 
{

	private String name;
	private String address;
	private String city;
	public ArrayList<Car> plist= new ArrayList<Car>();
	
	
	public Parking(String name, String address, String city) {
		super();
		this.name = name;
		this.address = address;
		this.city = city;
	}
	
	public void addCar(Car c)
	{
		plist.add(c);
	}
	
	
	public int countCars()
	{
		return plist.size();
	}
	
	public int countByBrand(String brand)
	{
		int  brandCount=0;
		for (int i = 0; i < plist.size(); i++) 
		{
			if(plist.get(i).getCarInfo().getBrand() == brand)
			{
				++brandCount;
			}
		}
		
		return brandCount;
	}
	
	
	
	
	
	
	
	
	
	
	
}
