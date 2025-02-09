package com.celcom.day5;

public class Person {
	String name;
	int age;

Person(String name,int age){
	this.name=name;
	this.age=age;
	
} void display() {
	System.out.println("name:"+name);
	System.out.println("age:"+age);
	
}
public static void main(String[] args) {
	Person info;
	info=new Person("kanaga",21);
	info.display();
	info=new Person("lakshmi",22);
	info.display();
}
}
