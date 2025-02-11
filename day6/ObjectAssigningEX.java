package com.celcom.day6;

public class ObjectAssigningEX {
	public static void main(String[] args) {
		ObjectAssigningEX obj1 =new ObjectAssigningEX();
		System.out.println(obj1.hashCode());
		ObjectAssigningEX obj2 =obj1;
		System.out.println(obj2.hashCode());
	}

}
