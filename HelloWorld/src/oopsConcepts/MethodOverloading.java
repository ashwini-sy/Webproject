package oopsConcepts;

public class MethodOverloading {
	
	public void  sum(int a, int b)
	{
	int sum=a+b;
	System.out.println("sum of 2 interger is :" + sum);
	
	}
	
	public void sum(int a, int b,int c)
	{
		 int sum =a+b+c;
		 System.out.println("Sum of 3 integer is :"+ sum);
	}
	
	protected void Sentence(String a,int b)
	{
		System.out.println(a + " " + b);
	}
	
	public  String Concat(String a,String b)
	{
		String Concatination= a + b;
		return Concatination;
		
	}
	
	
	

}
