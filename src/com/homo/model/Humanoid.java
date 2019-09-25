package com.homo.model;

public abstract class Humanoid
{
	protected String name;
	protected double health;
	protected double force;
	public Humanoid(String name, double health, double force) 
	{
		this.name = name;
		this.health = health;
		this.force = force;
	}
	
	public void attack(Humanoid h)
	{
		h.health -= this.force;
	}
	public void receiveDamage(double damage)
	{
		this.health -= damage;
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public double getForce() {
		return force;
	}

	public void setForce(double force) {
		this.force = force;
	}

	
	
}
