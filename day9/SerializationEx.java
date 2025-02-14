package com.celcom.day9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
	transient int eid;
	private String ename;
	private int esalary;

	public Employee(int eid, String ename, int esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEsalary() {
		return esalary;
	}

	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}

}

public class SerializationEx {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee kanaga = new Employee(101, "Kanaga", 1500);

		// serialzation
		FileOutputStream fount = new FileOutputStream("D://objectFile.txt");
		ObjectOutputStream objout = new ObjectOutputStream(fount);

		objout.writeObject(kanaga);
		objout.close();
		fount.close();
		System.out.println("Object Saved");

		// de serialzation
		FileInputStream fin = new FileInputStream("D://objectFile.txt");
		ObjectInputStream objin = new ObjectInputStream(fin);
		Employee emp = (Employee) objin.readObject();
		objin.close();
		fin.close();
		System.out.println(emp);
	}

}
