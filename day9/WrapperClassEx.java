package com.celcom.day9;

public class WrapperClassEx {
	public static void main(String[] args) {
		int a = 10;
		Integer obj1 =new Integer(a);//Boxing
		int b = obj1.intValue();//unBoxing
		
		
		//jdk 1.5
		Integer obj2 = a;//auto  Boxing
		int c= obj2;//auto 	unBoxing
		
		System.out.println(b);
		System.out.println(c);
	}
	

}
