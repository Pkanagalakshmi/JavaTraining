package com.celcom.day3;
class Values {
	String name;
	String color;
	int price;
	Values(String name,String color,int price){
		this.name=name;//
		this.color=color;
		this.price=price;
	}
	void display() {
		System.out.println("Mobile :" +name);
		System.out.println("color :" +color);
		System.out.println("price :" +price);

		
	}
}

public class MobilePhone{
	
	public static void main(String[] args) {
		Values phone =new Values("Oppo","Blue",15000);
		phone.display();
		
	}
		
		
	}
		
		
	