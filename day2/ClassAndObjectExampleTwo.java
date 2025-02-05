package com.celcom.day2;
class Fruits{
	String color;
	int size;
	int price;
	Fruits( String color,int size,int price ){
		this.color=color;
		this.size=size;
		this.price=price;	
	}
	void display() {
		System.out.println("Fruit Color :"+color);
		System.out.println("Fruit size :"+size);
		System.out.println("Fruit price :"+price);
	}
	void setPrice(int price) {
		this.price=price;
	}	
}
public class ClassAndObjectExampleTwo {
	public static void main(String[] args) {
		Fruits banana =new Fruits("Yellow",2,100);
		banana.display();
		banana.setPrice(200);
		banana.display();
		
	}
	

	

}
