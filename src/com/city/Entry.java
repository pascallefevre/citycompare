package com.city;

import com.mabanq.model.Bankinfo;
import com.mabanq.model.Compagny;
import com.mabanq.model.Employee;
import com.mabanq.model.Status;

public class Entry
{
	
	
	
	public static void main(String[] args)
	{
		test1();
		
	}
	
	public static void test1() 
	{
		Bankinfo b= new Bankinfo("15354B536","Axa Banque");
		Status s= new Status(1955);
	
		Employee nico= new Employee( "Tan", "Nicolas",35000, b,s);
		
		Employee rom= new Employee( "Augis", "Romain",36000, b,s);
		Employee nen= new Employee( "Dionnet", "Bennoit",32000, b,s);
		
		Compagny sop=new Compagny("Sopra Steria");
		
		sop.addEmployee(nen);
		sop.addEmployee(rom);
		sop.addEmployee(nico);
		
		System.out.println(sop);
		
		sop.removeById(3);
		System.out.println(sop);
		
	}
	public static void test2() 
	{
	
		
		
	}
	
	
}