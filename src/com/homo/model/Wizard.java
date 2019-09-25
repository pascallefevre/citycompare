package com.homo.model;

public class Wizard extends Humanoid 
{
	private double mana;
	private double intelligence;
	private boolean shield=false;
	private int nbShieldAttack=0;
	private final double MANA_COST=10;



	public Wizard(String name, double health, double force, double mana, double intelligence) 
	{
		super(name, health, force);
		this.mana = mana;
		this.intelligence = intelligence;
	}



	public void spellCast(Humanoid h)
	{
		this.mana-=MANA_COST;
		h.health -= this.force + this.intelligence;
	}

	public void activateShield()
	{
		if (mana >= MANA_COST)
		{
			this.mana -= MANA_COST;
			this.shield = true;
		}
	}



@Override
public void receiveDamage(double damage) 
{
	if(shield == true && nbShieldAttack<5) 
	{
		nbShieldAttack += 1;
	super.receiveDamage(damage*0.8);
	
	}
	else super.receiveDamage(damage);
}







}
