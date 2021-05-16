package test;

public class ThrowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsExample obj=new ThrowsExample();
		try {
		obj.Eligibilty(17);
		}catch(ArithmeticException e)
		{
			System.out.println("Exception handled");
		}

	}
	
	public void Eligibilty(int age) throws ArithmeticException
	{
		if(age<18)
		{
			throw new ArithmeticException("Age is not valid");
		}
		else
		{
			System.out.println("Ageis valid for voting");
		}
		
	}

}
