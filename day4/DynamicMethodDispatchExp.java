package com.celcom.day4;

class Animal{
	int a =10;
	void move() {
		System.out.println("move");
	}
}

class Cat extends Animal{
	int a = 1;
	int b =2;
	void move() {
		System.out.println("cat walks");
	}
}


public class DynamicMethodDispatchExp {
	public static void main(String[] args) {
		Animal moves = new Cat();
		moves.move();
		System.out.println(moves.a);
		
	}
	

}
