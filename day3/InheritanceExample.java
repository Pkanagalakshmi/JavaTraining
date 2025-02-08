package com.celcom.day3;


class Vehicle {
	void engine() {
		System.out.println("Engine");
	}
	void breaks() {
		System.out.println("breaks");
	}
}


class FourWheeler extends Vehicle{
	void Wheels() {
		System.out.println("Four Wheel");
	}	
}
class Truck extends Vehicle{
	void name() {
		System.out.println("Truck");
	}
}
class Car extends FourWheeler{
	void name() {
		System.out.println("Kia");
	}
}


public class InheritanceExample{

	public static void main(String args[]) {
		Car b = new Car ();
		b.name();
		b.Wheels();
		b.breaks();
		b.engine();
		
		
		
	}
}
	


