package com.celcom.day5e;
interface AnimalsPlan{
	abstract void move();
	abstract void eat();
	
}
abstract class Animals{
	abstract void move();
	abstract void eat();
}

class Cats extends Animals implements AnimalsPlan{
	public void move() {
		System.out.println("Cats walk");
	}
	public void eat() {
		System.out.println("Cats eat rats");
	}
}

class Sparrow extends Animals{
	void move() {
		System.out.println("Sparrows fly");
	}
	void eat() {
		System.out.println("Sparrows eat grains");
	}
}

class Fish extends Animals{
	void move() {
		System.out.println("Fish swim");
	}
	void eat() {
		System.out.println("Fish eat sea plants");
	}
}

public class MethodOverridingExp2 {

	public static void main(String[] args) {
		Animals animals;

	    animals = new Cats();
		animals.move();
		animals.eat();
	
		animals = new Fish();
		animals.move();
		animals.eat();
		
		animals = new Sparrow();
		animals.move();
		animals.eat();

	}

}