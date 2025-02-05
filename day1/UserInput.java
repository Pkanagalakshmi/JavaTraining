package com.celcom.day1;
import java.util.Scanner;
public class UserInput{
public static void main(String args[]){

Scanner scanner =new Scanner(System.in);
System.out.println("Enter emp id,name,salary");
int eid =scanner.nextInt();
String ename =scanner.next();
double esalary = scanner.nextDouble();
System.out.println("Enter emp id :"+ eid);
System.out.println("Enter empname :"+ ename);
System.out.println("Enter empsalary :"+ esalary);
scanner.close();


}

}