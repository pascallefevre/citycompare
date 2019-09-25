package com.homo.model;

public class Orc extends Humanoid
{

	protected double rage;
	private final double RAGE_LOAD=8;

	public Orc(String name, double health, double force, double rage) 
	{
		super(name, health, force);
		this.rage = rage;
	}
	
	public void useRage(Humanoid h)
	{
		if(this.rage >= RAGE_LOAD)
		{
			this.rage -= RAGE_LOAD;
			h.health -= this.force*1.5;
		}
	}
	
	public void addRage(double rage)
	{
		this.rage += RAGE_LOAD*1.6;
	}
	
}
