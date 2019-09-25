package com.mabanq;

import java.util.ArrayList;
import java.util.List;

import com.city.model.A;
import com.city.model.City;

public class Entry
{
	
	
	
	public static void main(String[] args)
	{
		test2();
		
	}
	
	public static void test1() 
	{
		
		City paris= new City("Paris","France",12, true);
		City berlin = new City("Berlin", "Deutschland", 8, true);
		
		System.out.println(berlin.makeCompare(paris));
		
	
	}
	public static void test2() 
	{
		A a = new A(12, "Arnold");
		
		System.out.println(a);
		
		List<Integer> maList = new ArrayList<Integer>();
		
		maList.add(10);
		maList.add(20);
		maList.remove(0);
		
		
	}
	
	
}