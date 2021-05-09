package test;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=scanner.nextInt();
		int count=0;
		if(number==1)
			System.out.println(number + " is not prime");
		if(number==2)
			System.out.println(number + " is  prime");		
		if(number>2)
		{			
			for(int i=2;i<number;i++)
			{
			   if(number % i== 0)
				 count++;				
			}
			
			if(count==0)
				System.out.println(number + " is prime number ");
			else
				System.out.println(number + " is not a prime number ");
				
		}		

	}

}
