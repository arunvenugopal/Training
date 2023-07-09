package assignmentsuperclass;

public class My_Child_Class extends My_Parent_Class //inheriting the parent class

{
	
	public void addResultCheck() // method to check the result
	{
		System.out.println("The Addition Result is: "+super.addition()); // using super keyword calling parent class addition method
		
		float result=super.sum; // using super keyword calling the parentclass variable sum
		
		if(result % 10 ==0)
		{
			System.out.println("The addition Result "+result+" is divisible by 10");
		}
		
		else
		{
			System.out.println("The addition Result "+result+" is not divisible by 10");
		}
	}
	
	

	public static void main(String[] args) 
	
	{
		
		My_Child_Class ob = new My_Child_Class();
		ob.addResultCheck();

	}

}
