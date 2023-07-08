package superkeyword;

public class ParentClassSuper {
	
	static int a =10;  // to get only the variable a is value in child calss = we use superkeyword
	int b=20;
	
	public ParentClassSuper()
	{
		System.out.println("Parent constructor");
	}
	
	public void sum3()
	{
		int c=a+b;
		System.out.println("The sum is: "+c);
	}

}
