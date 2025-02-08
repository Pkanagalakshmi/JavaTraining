package com.celcom.day4;

class Animal2{ 
	String msg = getMsg();
	String getMsg() { 
		return "a";
	}
}

final class Cat2 extends Animal2{
	 String getMsg() {
		return "b";
	}
}

public class FinalKeywordExp {
	public static void main(String[] args) {
		Animal2 ani = new Cat2();
		System.out.println(ani.msg);
}

}