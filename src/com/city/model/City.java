package com.city.model;






public class City 
{
	
	private String name;
	private String country;
	private int population;
	private String category="Small";
	private Boolean capital;
	
	public City(String name, String country, int population, Boolean capital)
	{
		super();
		this.name = name;
		this.country = country;
		this.population = population;
		this.capital = capital;
		
		
		
		if (capital!=true && this.population>3) 
		{
			this.category = "Big";
		}
		else if (capital == true && this.population>7) 
		{
			this.category= "Big";
		}
		
	}
	
	public String makeCompare(City c)
	{
		String text= this.name;
		if(this.population > c.population)
		{
			text+=" is bigger than ";
		}
		else if (this.population == c.population)
		{
			text+=" have the same size than ";
		}
		else text+=" is smaller than ";
		
		text+= c.name;
		
		 return text;
		
	}
	
	
	}
	
	
	







































