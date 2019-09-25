package com.homo.model;

public class Warrior extends Humanoid
{
	public Warrior(String name, double health, double force)
	{
		super(name, health, force);

	}

	public void doubleAttack(Humanoid h)
	{	
		double oldForce = this.force;
		
		this.force *= 0.7;
		this.attack(h);
		this.attack(h);
		
		this.force = oldForce;
		
	}
}
