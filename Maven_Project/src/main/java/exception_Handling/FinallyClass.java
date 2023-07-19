package exception_Handling;

public class FinallyClass {

	
	public void div()
	{
		int a=10;
		try 
		{
		int div=a/0; 
		System.out.println("The division result is: "+div);
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled:");
		}
		
		finally
		{
			System.out.println("Final block handled");
		}
		
	}

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		Try_Catch ob=new Try_Catch();
		
		ob.div();

	}

}
