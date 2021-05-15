package test;

public class ExceptionEx {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		String C="C";
		System.out.println("Hello");
		//System.out.println(a/b);
		try {
			System.out.println("HelloTRY");
			int n=a/b;
			System.out.println("Try block");
		}
		catch(ArithmeticException e)
		{
			System.out.println(b/a);
			System.out.println("Arthematic exception handled");
		}catch(Exception e)
		{
			System.out.println("Expection handled");
		}finally{
			System.out.print("TRY-CATCH BLOCK EXECUTED SUCCESSFULLYY");
		}
	//NULLPOINTER EXPCETION	
		ExceptionEx obj=null;
		try {
		obj.dispaly();
		}catch(NullPointerException e)
		{
			System.out.println("null Pointer Exception hANDLED");
			
		}
		//INDEXOUTOFBOUND EXCEPTION
		
		int arr[]= {1,2,34};
		try {
		System.out.println(arr[4]);
		
		}catch(ArrayIndexOutOfBoundsException E)
		{
			System.out.println("INDEX OUT OF BOUND EXCEPTION HANDLED");
		}
			
	}
	
	public void dispaly()
	{
		System.out.println("DISPAY METHOD");
	}

}
