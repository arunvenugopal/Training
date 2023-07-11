package finalpack;

public class FinalChild extends FinalParent 

{
	
	//public final void lastMethod()   // can't override final method
	{
		System.out.println("Final method printing");
	}
	

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
		FinalChild kt=new FinalChild();   // but Final method we can inherit by creating an object of the child class
		kt.lastMethod();

	}

}
