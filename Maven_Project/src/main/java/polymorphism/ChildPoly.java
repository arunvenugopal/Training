package polymorphism;

public class ChildPoly extends ParentPoly

{

	public void pamethod(int i) // methodname and arguments are same as that of the parent class
	{
		super.pamethod(10);  // super keyword is used to invoke the parent class's method
		System.out.println("Child Method");
		System.out.println(i);
	}
	
	public static void main(String[] args) 
	
	{
	   
		ChildPoly ob=new ChildPoly();
		ob.pamethod(11);  // child class method is invoked by using child class object creation
		

	}

}
