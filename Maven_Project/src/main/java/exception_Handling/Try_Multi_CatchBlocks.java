package exception_Handling;

public class Try_Multi_CatchBlocks 

{
	
	public void arrayPrint()
	{
		int a[]=new int[5];
		
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		try {
		a[5]=30/0;
		
		for (int b=0;b<a.length;b++)
		{
			System.out.println(a[b]);
		}
		}
		catch(ArithmeticException c) 
		{
			System.out.println("Arithmetic Exception handled");
		}
		
		catch(ArrayIndexOutOfBoundsException d)
		{
			System.out.println("Array out of Bound Exception handled");
		}
		
		catch(Exception e)
		{
			System.out.println("Exception handled");
		}
	}

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
		Try_Multi_CatchBlocks op= new Try_Multi_CatchBlocks();
		op.arrayPrint();

	}

}
