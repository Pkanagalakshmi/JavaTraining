package com.celcom.day5;

 class Shapes{
	double getArea() {
		return 0;
	}
 }
class RectanagleNew extends Shapes{
	double width,height;
	RectanagleNew(double width,double height){
		this.width=width;
		this.height=height;	
	}
	double getArea() {
		return width*height;
	}	
}
public class Shapes1{
	public static void main(String[] args) {
		RectanagleNew ans= new RectanagleNew(5,6);
		System.out.println(ans.getArea());		
	}
}
