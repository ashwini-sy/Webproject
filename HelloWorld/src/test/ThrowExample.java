package test;

import java.util.Scanner;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the age :");
		int n=sc.nextInt();
		
		try {
		if(n<18)
		{
			throw new ArithmeticException("Not a valid age for voting");
		}
		else
		{
			System.out.println("Eligible for voting");
		}
		}catch(ArithmeticException e)
		{
			System.out.println("Exception handled for arithmetic");
		}

	}

}
