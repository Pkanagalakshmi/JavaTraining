package com.celcom.day5e;
 abstract class Vehicle{
	void noOfEngine() {
		System.out.println("No of engine");
	}
	abstract void noOfWheels();
	abstract void brandName();
	
}
 class Car extends Vehicle{

	 void noOfWheels() {
		 System.out.println("I have four wheels");
	 }
	 void brandName() {
		 System.out.println("My brand Name Benz");
	 }	
 }
abstract public class AbstractClassExampleOne{
	public static void main(String[] args) {
		Vehicle info;
		info = new Car();
		info.noOfEngine();
		info.brandName();
		info.noOfWheels();		
	}
}
