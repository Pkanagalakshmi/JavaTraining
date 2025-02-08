package com.celcom.day3;

class Emloyee{
	private int eid;
	private String ename;
	private int salary;
	public Emloyee() {
		
	}
	public Emloyee(int eid, String ename, int salary) {
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

	
}
public class BeanClass {
	public static void main(String[] args) {
		Emloyee emp =new Emloyee(12,"kanaga",12000);
		emp.setEid(13);
		System.out.println(emp.getEid());
		
		
	}
	

}
