package com.celcom.day4;
class grass{
	String msg = getMsg();
	String getMsg() {
		return "a";
	}
}

class dog extends grass{
	String getMsg() {
		return "b";
	}
}

public class DynamicMethodDispatchExp2 {
	public static void main(String[] args) {
		grass ani = new dog();
		System.out.println(ani.msg); 
		
		

	}

}
