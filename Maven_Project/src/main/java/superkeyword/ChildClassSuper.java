package superkeyword;

public class ChildClassSuper extends ParentClassSuper 
{
	public ChildClassSuper()
	{
		super();
		System.out.println("Childclass constructor");
		this.display();
	}
	
	
	public void display()
	{
		System.out.println("Hi");
		System.out.println("Calling Parent variable a in child class "+super.a);
		super.sum3();
	}

	public static void main(String[] args) 
	
	{
		ChildClassSuper ob=new ChildClassSuper();
		
		

	}

}
