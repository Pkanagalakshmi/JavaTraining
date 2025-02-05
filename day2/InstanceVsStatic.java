package com.celcom.day2;

public class InstanceVsStatic {
	int a =10;
	static int b=100;
public static void main(String[] args) {
	
	//Instance Variable
	
	
	InstanceVsStatic obj1 =new InstanceVsStatic();
	InstanceVsStatic obj2 =new InstanceVsStatic();
	System.out.println(obj1.a);//10
	System.out.println(obj2.a);//10
	obj2.a=20;
	System.out.println(obj1.a);//10
	System.out.println(obj2.a);//20
	
	
	//Static variable
	System.out.println(b);//100
	System.out.println(b);//100
	b=200;
	System.out.println(b);//200
	System.out.println(b);//200

	

	
	
	
}
}
