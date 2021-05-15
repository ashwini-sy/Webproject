package oopsConcepts;

public class RunnerMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Concepts of Method Overloading
		MethodOverloading obj=new MethodOverloading();
		obj.sum(1, 2);
		obj.sum(1, 2,7);
		obj.Sentence("Ash's age is",  11);
		System.out.println(obj.Concat("Ashwini", "Sadashiva"));
		MethodOverrideParent obj1=new MethodOverrideParent();
		obj1.display();
		obj1.display(1);
		
		
		
		//Method Overriding
		MethodOverrideChild  obj2=new MethodOverrideChild();
		obj2.display();
		obj2.display(1);
		
		
		//Abstract Concepts:
		
		AbstractChild obj3=new AbstractChild();
		obj3.method2();
		obj3.method1();
		AbstractChild.method3();
		AbstractExample.method4();
		AbstractChild.method4();
	

	}

}
