package pack1;

public class Class1 

{
	
	public void m1()
	{
		System.out.println("Method Public 1");
	}
	
	private void m2()
	{
		System.out.println("Method Private 1");
	}
	
	protected void m3()
	{
		System.out.println("Method Protected 1");
	}
	
	void m4()
	{
		System.out.println("Method Default 1");
	}
	
	

	public static void main(String[] args) 
	
	{
		Class1 o1 = new Class1();
		
		o1.m1(); // public can be called
		o1.m2(); // private can be called
		o1.m3(); // protected can be called
		o1.m4(); // default can be called
			

	}

}
