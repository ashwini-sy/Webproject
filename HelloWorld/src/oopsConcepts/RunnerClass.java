package oopsConcepts;

import java.util.Scanner;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crate the employee details
		ClassA emp1=new ClassA(100,"ash","org");
		
		//Scanner scanner=new Scanner(System.in);
		//int No_of_emp=scanner.nextInt();		
		/*emp1.Name="Mithali";
		emp1.OrgName="Organization";
		emp1.Salary=1200;*/	
		
		System.out.println(emp1.Salary);
		emp1.Display();
		emp1.salary_deduction(45000,50000);
		//emp1.directmd();-->Not able to call the method from Class B since its not inherted to Class A
		
		SubClassB obj=new SubClassB();
		obj.directmd();
		obj.Name="Ash";
		obj.OrgName="org";
		obj.Display();
		System.out.println(obj.OrgName);
		System.out.println(obj.b1);
		
		//Class inherts SubClassB
		
		ClassC obj1=new ClassC();
		obj1.Name="Ash1";
		obj1.OrgName="org11";
		obj1.Display();
		obj1.salary_deduction(56000, 60000);
		
				

	}

}
