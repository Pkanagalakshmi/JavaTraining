package com.celcom.day6;

public class ObjectCloningEX implements Cloneable {
	public static void main(String[] args) throws CloneNotSupportedException {
		ObjectCloningEX obj1 = new ObjectCloningEX();
		System.out.println(obj1.hashCode());
		ObjectCloningEX obj2 = (ObjectCloningEX) obj1.clone();
		System.out.println(obj2.hashCode());
	}

}
