package com.celcom.day7;

interface MyInterface {
	void display();
}

public class AnonymusInnerClass implements MyInterface {
	public void display() {
		System.out.println("Annonymus Inner Class");
	}

	public static void main(String[] args) {
		AnonymusInnerClass obj = new AnonymusInnerClass();
		obj.display();

		MyInterface obj1 = new MyInterface() {
			public void display() {
				System.out.println("Annonymus Inner Class");
			}
		};
		obj1.display();
		
		//lambda Expression
		MyInterface obj2 =()-> System.out.println("Display");
		obj2.display();
	}

}
