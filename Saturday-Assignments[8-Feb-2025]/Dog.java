package com.celcom.day5;

public class Dog {
	String name;
	String breed;
Dog(String name,String breed){
	this.name=name;
	this.breed=breed;
}
void setName(String name) {
	this.name=name;
}
void setBreed(String breed) {
	this.breed=breed;
}
void display() {
	System.out.println("Name:"+name);
	System.out.println("Breed:"+breed);
}

public static void main(String[] args) {
	Dog info;
	info=new Dog("Rax","Labrador");
	info.display();
	info=new Dog("Max","Beagle");
	info.display();
	info.setName("lax");
	info.display();
}
}
