package com.car.model;

public class Car 
{

	public static int totalAmount;
	
	
	private int speed=0;
	private int maxSpeed =220;
	private CarInfo carInfo;
	public Car(CarInfo carInfo) {
		
		this.carInfo = carInfo;
	}
	public Car(int speed, CarInfo carInfo) 
	{
	
		this.speed = speed;
		this.carInfo = carInfo;
	}
	public Car( String serialNumber, String brand, int speed) {
		this.carInfo = new CarInfo(serialNumber, brand);
		this.speed = speed;
	}
	
	public static String compare(Car c1, Car c2) 
	{
		String x="";
		double  y=0;
		String z="";
		String ccc="";
		
		String text= "The car "+z+" is going "+y+" km.h^-1 "+ccc+" then the car "+z+" !";
		String text2= "The car "+z+" is going the same speed then the car"+z+" !";
		if (c1.speed >c2.speed) 
		{
			
		x=c1.carInfo.getSrialNumber();
		y= Math.pow(   Math.pow(c1.speed - c2.speed, 2) , 0.5) ;
		z=c2.carInfo.getSrialNumber();
		ccc="more";
		return text;
		}
		else if(c1.speed >c2.speed)
		{
			x=c1.carInfo.getSrialNumber();
			y= Math.pow(   Math.pow(c1.speed - c2.speed, 2) , 0.5) ;
			z=c2.carInfo.getSrialNumber();
			ccc="less";
			return text;
		}
		else  return text2;
		
		
	}
	public String compare( Car c2)
	{
		String x="";
		double  y=0;
		String z="";
		String ccc="";
		
		String text= "The car "+z+" is going "+y+" km.h^-1 "+ccc+" then the car "+z+" !";
		String text2= "The car "+z+" is going the same speed then the car"+z+" !";
		if (this.speed >c2.speed) 
		{
			
		x=this.carInfo.getSrialNumber();
		y= Math.pow(   Math.pow(this.speed - c2.speed, 2) , 0.5) ;
		z=c2.carInfo.getSrialNumber();
		ccc="more";
		return text;
		}
		else if(this.speed >c2.speed)
		{
			x=this.carInfo.getSrialNumber();
			y= Math.pow(   Math.pow(this.speed - c2.speed, 2) , 0.5) ;
			z=c2.carInfo.getSrialNumber();
			ccc="less";
			return text;
		}
		else  return text2;
		
		
	}
	@Override
	public String toString() {
		return "Car [speed=" + speed + ", maxSpeed=" + maxSpeed + ", carInfo=" + carInfo + "]";
	}
	public CarInfo getCarInfo() {
		return carInfo;
	}
	public void setCarInfo(CarInfo carInfo) {
		this.carInfo = carInfo;
	}
	
	
	
	
	

	
	
	

	
	
	
	
	
	
}
