package pack2;

import pack1.Class1;

public class Class1A extends Class1

{
	
	
	public static void main(String[] args) 
		
		{
			Class1A ob8 = new Class1A();
			
			ob8.m1(); // public can be called
			                 // ob8.m2(); // private can't be called
			ob8.m3(); // protected can be called
			                 // ob8.m4(); // default can't be called
			
			
			// private & protected methods can't be called in another package class

		}

	}
