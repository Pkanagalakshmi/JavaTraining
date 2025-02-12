package com.celcom.day7;
 
interface Calculator{
	int cals(int a ,int b);
}
public class LambdaEx {
	public static void main(String[] args) {
		Calculator ref = (a,b)-> a + b;
		System.out.println(ref.cals(10, 20));
		ref = (a,b)->a-b;
		System.out.println(ref.cals(20, 10));
		
	}
	

}
