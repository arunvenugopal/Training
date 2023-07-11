package aggragateAssignment;

public class AddressClass 

{
	
	String sadd;
	SClass q;
	
	public AddressClass(String sadd, SClass q)
	{
		this.sadd=sadd;
		this.q=q;
		
		System.out.println("Class address");
		System.out.println(sadd);
		

	}

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
		SClass ob1=new SClass("Arun V", 101);
		AddressClass ob2=new AddressClass("Mahesh V S", ob1);

	}

}
