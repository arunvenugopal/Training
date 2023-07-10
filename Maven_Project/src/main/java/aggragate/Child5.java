package aggragate;

public class Child5 

{
	String name1;
	int age1;
	Parent5 p; // to refer parent class properties
	
	public Child5(String name1, int age1, Parent5 p)  // creating parent class reference variable
	{
		System.out.println("The child class");
		
		this.name1=name1;
		this.age1=age1;
		this.p=p;
		
	}
	
	public void childPrint()
	{
		System.out.println("Parent class name is: "+p.name);
		System.out.println("Parent class Id is: "+p.id);
		System.out.println();
		System.out.println("Child class name is: "+name1);
		System.out.println("Child class Id is: "+age1);
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent5 obp = new Parent5("Arun V", 101);  // parent class object creation
		Child5 obc = new Child5("Mahesh V S", 102, obp);  // child class object creation // obp used to get parent's object
		obc.childPrint();
		

	}

}
