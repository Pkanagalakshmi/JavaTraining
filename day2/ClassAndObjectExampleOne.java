package com.celcom.day2;

class Employee {
	int eid;
	String ename;
	double esalary;
	Employee(int id,String name,double salary){
		eid=id;
		ename=name;
		esalary=salary;	
	}
	public void display() {
		System.out.println("Employee Id :"+eid);
		System.out.println("Employee Name :"+ename);
		System.out.println("Employee Salary :"+esalary);
	}
	
}
public class ClassAndObjectExampleOne{
public static void main(String[] args) {
		Employee kanaga =new Employee(101,"kanaga",10000);
		kanaga.display();
		Employee lakshmi =new Employee(101,"lakshmi",10000);
		lakshmi.display();
	}
	}
	


