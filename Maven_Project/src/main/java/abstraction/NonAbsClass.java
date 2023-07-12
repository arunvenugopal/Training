package abstraction;

public class NonAbsClass extends AbcClass
{

	public static void main(String[] args) 
	
	{
		NonAbsClass so = new NonAbsClass();  // creating child class object
		
		
		
		so.absMethod();   // invoking abstract method from class 1
		so.nonAbsMethod();  // invoking non-abstract method from class 1
		
		so.classTwoMethodprint();  // invoking the class 2 method

	}
	
	public void classTwoMethodprint() // a method in 2nd class
	{
		System.out.println("method from 2nd class");
	}

	@Override
	public void absMethod() // 1st class methods definition will be given here
	
	{
		int a = 10;
		int b = 20;
		int sum = a+b;
		
		System.out.println("The sum is: "+sum);
		
		
	}

}
