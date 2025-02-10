package com.celcom.day5;

public class Rectangle {
	double width,height;
	Rectangle(double width,double height){
		this.height=height;
		this.width=width;	
}
	void Area() {
		System.out.println("Area: "+width*height);	
	}
	void Perimeter () {
		System.out.println("Perimeter :"+2*(width+height));
	}
	public static void main(String[] args) {
		Rectangle ans;
		ans=new Rectangle (5,10);
		ans.Area();
		ans.Perimeter();
		
		
	}
}
