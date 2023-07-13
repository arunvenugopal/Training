package interfaceExample;

public class SubbClass implements Interface1, Interface2  // Use the keyword 'implements' to extend interface to the sub class

{

	public static void main(String[] args) 
	
	{
		SubbClass sa = new SubbClass();  // object creation of the sub class
		
		sa.interfaceMethod();  // invoking the interface abstract method by using sub class object
		sa.summ();  // invoking the interface abstract method by using sub class object
		
		System.out.println("Printing the interface variable a value: "+sa.a);  // statement to print the interface variable from interface class
		
		sa.interfaceMethod2();
	
	}

	public void interfaceMethod() // the definition of the interface abstract method will be writing in sub class
	
	{
		
		System.out.println(" Printing interface abstract method 1 o/p");
		
	}

	public void summ() // the definition of the interface abstract method will be writing in sub class
	{
		
		System.out.println(" Printing interface abstract method 2 o/p");
	}
	

	public void interfaceMethod2() 
	{
		System.out.println("2nd interface method");
		
	}

}
