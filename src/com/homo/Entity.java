package com.homo;

import com.homo.model.Orc;
import com.homo.model.Warrior;
import com.homo.model.Wizard;

public class Entity 
{

	public static void main(String[] args) 
	{
	
		Orc croh= new Orc("Croooohh", 150, 60, 8);
		Wizard mike=new Wizard("Mike", 60, 20, 30, 120);
		Warrior harald=new Warrior("harald", 100, 40);
		
		croh.attack(harald);
		System.out.println(harald.getHealth());
		
		mike.activateShield();
		mike.spellCast(croh);
		System.out.println(croh.getHealth());
		
		harald.doubleAttack(mike);
		harald.doubleAttack(mike);
		harald.doubleAttack(mike);
		System.out.println(mike.getHealth());
		
	}
}
