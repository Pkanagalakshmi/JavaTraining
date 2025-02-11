package com.celcom.day6;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class UncheckedEx {
	static void m1() throws FileNotFoundException {
		FileReader fr = new FileReader("abc.txt");

	}

	static void m2() {
		try {
			m1();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

	}

}
