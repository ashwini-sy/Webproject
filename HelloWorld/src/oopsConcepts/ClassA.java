package oopsConcepts;

import java.util.Scanner;

public class ClassA {
	
	 int Salary;
	 String Name;
	 String OrgName;
	 int Sal;
	 private int value;
	
	protected int s1;
	public ClassA()
	{
		System.out.println("Inside the constructor");
	}
	
	/*public ClassA() {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the salary of the employee : ");
		int Salary=scanner.nextInt();
		System.out.println("enter the Name of the employee : ");
		Scanner scanner1=new Scanner(System.in);
		String Name=scanner.next();
		System.out.println("enter the ORganization name of the employee : ");
		Scanner scanner2=new Scanner(System.in);
		String OrgName=scanner.next();
	}*/
	
	public  ClassA(int a,String b,String c)
	{
		System.out.println("Inside the Parametrized contructor");
		Salary=a;
		Name=b;
		OrgName=c;
		
	}
	
	public void Display() {
		System.out.println("Name of the Employee: "+Name);
		System.out.println("Salary of the Employee: "+Salary);
		System.out.println("Name of the Organization: "+OrgName);
	}
	
	public  int salary_deduction(int sal1,int sal2) {
		
		Sal=sal2-sal1;
		System.out.println("Total sal deduted :" + Sal);
		return Sal;
		
	}
	

}
