package com.celcom.day8;

public class StringEx1 {
	public static void main(String[] args) {
		String s1 = "Java";
		s1 = s1.concat("World");
		System.out.println(s1);
		StringBuffer sb =new StringBuffer("Java");
		sb.append("World");
		System.out.println(sb);
		StringBuilder sb1 = new StringBuilder("java");
		StringBuilder append = sb1.append("World");
		System.out.println(append);
		
	}

}
