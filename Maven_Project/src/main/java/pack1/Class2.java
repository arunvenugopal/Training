package pack1;

public class Class2 extends Class1

{

	public static void main(String[] args) 
	
	{
		/* Class2 o2 = new Class2();  // child class object creation
		
		o2.m1(); // public can be called
		       //o2.m2(); // private can't be called
		o2.m3(); // protected can be called
		o2.m4(); // default can be called  */
		
		
		Class1 o1 = new Class1();   // parent class object creation
		
		o1.m1(); // public can be called
		     // o1.m2(); // private can not be called
		o1.m3(); // protected can be called
		o1.m4(); // default can be called
		
		
		// Private methods can't be called in child class by creating the class object of parent class or the child class
				

	}

}
