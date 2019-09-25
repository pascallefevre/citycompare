package com.mabanq.model;

import java.util.ArrayList;

public class Compagny 
{
	private String name;
	private ArrayList<Employee> elist= new ArrayList<Employee>();
	
	public Compagny(String name) {
		super();
		this.name = name;
	}
	
	public void addEmployee(Employee e)
	{
		elist.add(e);
	}
	
	public void removeById(int idrm)
	{
		for (int i = 0; i < elist.size(); i++) 
		{
			if (elist.get(i).getId() == idrm)
			{
				elist.remove(i);
			}
		}
	}


	@Override
	public String toString() {
		return "Compagny [name=" + name + ", elist=" + elist + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
