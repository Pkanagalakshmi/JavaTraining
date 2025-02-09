package com.celcom.day5;

class Vehicle {
	void drive() {
		System.out.println("I am driving");
	}
}
class Car extends Vehicle {
	void drive() {
		System.out.println("Repairing a car");
	}
}

public class Vehicle1{
	public static void main(String[] args) {
		Vehicle info;
		info= new Vehicle();
		info.drive();
		info =new Car();
		info.drive();
		
	}
	
}

