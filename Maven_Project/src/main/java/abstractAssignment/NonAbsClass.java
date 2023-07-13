package abstractAssignment;

public class NonAbsClass extends AbsClass

{

	public static void main(String[] args) 
	{
		NonAbsClass ot = new NonAbsClass();
		
		ot.cat();
		ot.pen();
		ot.book();
		
		ot.nonAbsMethod1();

	}

	@Override
	public void cat() 
	{
		System.out.println("Cat is an animal, which can run");
		
	}

	@Override
	public void pen() 
	{
		System.out.println("Pen is for writting");
		
	}

	@Override
	public void book() 
	{
		
		System.out.println("Book is for reading");
	}

}
