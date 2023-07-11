package finalpack;

public class FinalParent 
{
	final int rollno=100;  //value should be given at declaration itself // this value we can't change inside on any methods
	final String name="Arun V";  //value should be given at declaration itself // this value we can't change inside on any methods
	
	public void add()
	{
		System.out.println("Final variables");
	}
	
	public final void lastMethod()
	{
		System.out.println("Final method printing");
	}
	
	public static void main(String[] args) 
	
	{
		FinalParent om= new FinalParent();
		
		om.add();
		
		System.out.println(om.rollno);   //these are instance variable
		System.out.println(om.name);  //these are instance variable
		
	

	}

}
