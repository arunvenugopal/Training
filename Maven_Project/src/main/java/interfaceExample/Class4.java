package interfaceExample;

public class Class4 implements Interface3

{

	public static void main(String[] args) 
	
	{
		Class4 opp = new Class4();
		
		opp.interfaceMethod2();
		opp.mm3();

	}

	public void interfaceMethod2() 
	
	{
		System.out.println("Interface 2 method o/p");
		
	}

	public void mm3() 
	
	{
		// TODO Auto-generated method stub
		
		System.out.println("Interface 3 method o/p");
		
	}

}
