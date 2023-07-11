package encapsulation;

public class ClassN {   // not using any inheritance properties

	public static void main(String[] args) 
	{
		
		ClassM ob6=new ClassM();  // In 2nd class main function, creating the class object of the 1st class
		
		ob6.set(101,"Arun V"); // Invoking the set method by using the 1st class object, to pass the values in the 2nd class
		
		ob6.get(); // Invoking the get method by using the 1st class object, to print/get the values in the 2nd class

	}

}
