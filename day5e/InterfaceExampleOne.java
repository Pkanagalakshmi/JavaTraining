package com.celcom.day5e;


interface VehiclePlanOne{
	
	void noOfEngine();
	
}
interface VehiclePlanTwo {
	void noOfWheels();
	void BrandName();
}
abstract class One{
	public static int a;

	public void noOfEnigne() {
		System.out.println("I have one Engine");
	}
	
}
 class Car1 extends One  implements  VehiclePlanOne,VehiclePlanTwo{
	public void noOfEngine() {
		System.out.println("I have two Engine");
	}
	public void noOfWheels() {
		System.out.println("I have four Wheels");
		
	}
	public void BrandName() {
		System.out.println("Benz");
		
	}

}

public class InterfaceExampleOne {
	public static void main(String[] args) {
		Car1 vec =new Car1();
		vec.noOfEngine();
		vec.noOfWheels();
		vec.BrandName();
		
		
	}
	
	
	

}
