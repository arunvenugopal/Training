package pack2;

import pack1.Class1;

public class Class2A extends Class1

{

	
	public static void main(String[] args) 
	
	{
		Class2A ob9 = new Class2A();
		
		ob9.m1(); // public can be called
		                      // ob9.m2(); // private can't be called
		ob9.m3(); // protected can be called
		                      // ob9.m4(); // default cann't be called
	}

}
