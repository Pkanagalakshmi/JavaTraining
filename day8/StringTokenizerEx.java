package com.celcom.day8;
import java.util.StringTokenizer;
public class StringTokenizerEx {
	public static void main(String[] args) {
		String s1 = "Welcom to Java Programming";
		StringTokenizer stringTokenizer = new StringTokenizer(s1," ");
		System.out.println(stringTokenizer.countTokens());
		while(stringTokenizer.hasMoreTokens()) {
			System.out.println(stringTokenizer.nextToken());
		}
	}

}
