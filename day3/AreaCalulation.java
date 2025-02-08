package com.celcom.day3;
import java.util.Scanner;
class Shape{
	float r,h;
	int b,l;
	int a=10;
	Shape(float r){
		System.out.println("Area of cricle:"+3.14*r*r);
	}
	Shape(float h,int l){
		System.out.println("Area of triangle :"+0.5*l*h);
	}
	Shape(int l,int b){
		System.out.println("Area of rectangle:"+l*b);
	}
	void display()
	{
		System.out.println("I am parent");
	}
}
class Circle extends Shape{
	int a=20;
	Circle(float r){
		super(r);
		a=30;
	}
	void display()
	{
		int a=20;
		System.out.println("child");
	}
}
class Triangle extends Shape {
	Triangle(float h , int l){
		super(h,l);
		
	}
}
class Rectangle extends Shape{
	Rectangle(int l,int b){
		super(l,b);
	}
}public class AreaCalulation {
	public static void main(String args[]) {
		System.out.println("Enter your choice: 1-circle, 2-triangle, 3-rectangle:");
		Scanner sc =  new Scanner(System.in);
		int input= sc.nextInt();
		if(input ==1 ) {
			
				
			System.out.println("Enter radius: ");
			float r = sc.nextFloat();
			Circle obj = new Circle(r);
			System.out.println(obj.a);
			obj.display();
		}
		else if (input == 2) {
			System.out.println("Enter height: ");
			float h = sc.nextFloat();
			System.out.println("Enter length: ");
			int l = sc.nextInt();
			Shape obj = new Triangle(h,l);
		}
		else if(input == 3) {
			System.out.println("Enter breadth: ");
			int b = sc.nextInt();
			System.out.println("Enter length: ");
			int l = sc.nextInt();
			Shape obj = new Rectangle(l,b);
		}
		
		sc.close();
	}
	

}








