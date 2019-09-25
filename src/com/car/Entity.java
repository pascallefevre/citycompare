package com.car;

import com.car.model.Car;
import com.car.model.CarInfo;
import com.car.model.OwnerInfo;
import com.car.model.Parking;

public class Entity {

	public static void main(String[] args)
	{
		test1();

	}
	
	public static void test1() 
	{
		
		CarInfo ci1 = new CarInfo("FG526PO","Delage");
		CarInfo ci2 = new CarInfo("DO225SC","Panhard");
		CarInfo ci3 = new CarInfo("EC866DY","Talbot");
		CarInfo ci4 = new CarInfo("UH526PO","Alpine");
		
		OwnerInfo p1= new OwnerInfo("Harald","Jenner");
		OwnerInfo p2= new OwnerInfo("Brigitte","Baatz");
		
		Car c1= new Car( 150,ci1);
		Car c2= new Car( 120,ci2);
		Car c3= new Car(130, ci3);
		Car c4= new Car(250, ci4);
		Car c5= new Car( 150,ci1);
		Car c6= new Car( 122,ci2);
		Car c7= new Car(130, ci3);
		Car c8= new Car(250, ci4);
		Car c9= new Car( 150,ci1);
		Car c10= new Car( 120,ci2);
		Car c11= new Car(130, ci3);
		Car c12= new Car(250, ci4);
		
		Parking pk = new Parking("Vinci 3", "ici", "Tolosa");
		
		pk.addCar(c1);
		pk.addCar(c2);
		pk.addCar(c3);
		pk.addCar(c4);
		pk.addCar(c5);
		pk.addCar(c6);
		pk.addCar(c7);
		pk.addCar(c8);
		pk.addCar(c9);
		pk.addCar(c10);
		pk.addCar(c11);
		pk.addCar(c12);
	
		pk.toString();
		
		
		pk.countByBrand("Alpine");
		pk.countCars();
	}

}
