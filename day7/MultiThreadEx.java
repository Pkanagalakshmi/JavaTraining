package com.celcom.day7;



public class MultiThreadEx{
	public static void main(String[] args) {
		Thread t =Thread.currentThread();
		System.out.println(t);
		System.out.println("Current Thread Name :"+ t.getName());
		System.out.println("Current Thread Priority :"+ t.getPriority());

	
	
	}

}
