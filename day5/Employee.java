package com.celcom.day5;

public class Employee {
	String name, jobtitle;
	double salary;
	Employee(String name,String jobtitle,double salary){
		this.name=name;
		this.jobtitle=jobtitle;
		this.salary=salary;	
	}
	void updatealary (double amount) {
		salary= salary+amount;	
	}
	void diplay() {
		System.out.println("Name: "+name+"\nJobtitle : "+jobtitle+"\nSalary : "+salary);
	}
	public static void main(String[] args) {
		Employee info = new Employee("Kanaga","Intern",15000);
		info.updatealary(500);
		info.diplay();
		
	}
	
}
