package com.celcom.day3;

	class VehicleOne{
		String name ="Super class variable";
		VehicleOne(){
			System.out.println("Super class constructor");
		}
		
		void NoOfEngine() {
			System.out.println("One engine");
		}
	}
class TwoWheelerOne extends VehicleOne{
	TwoWheelerOne(){
		super();
		
	}
	void Wheels() {
		super.NoOfEngine();
		System.out.println("Two");
		System.out.println(super.name);
	}
}
public class  SuperKeywordExp{
	public static void main(String[] args) {
		TwoWheelerOne v = new TwoWheelerOne();
		v.Wheels();
	}

}
	


