package oopsConcepts;

public class MethodOverrideChild extends MethodOverrideParent{
	
	public  void display()
	{
		System.out.println("Inside the child");
	}
	public void display(int a)
	{
		System.out.println("Inside the child with integer :"+ a);
	}
	
	
	

}
