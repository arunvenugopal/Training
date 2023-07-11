package encapsulation;

public class ClassM 

{
	private int id;   // 1st class variables should be private
	private String name;   // 1st class variables should be private

	public void set(int id, String name)  // using setter method to set the 1st class variables
	{
		this.id=id;
		this.name=name;
	}
	
	public void get()  // using getter method to get the 1st class variable values in the 2nd class
	{
		System.out.println(id);
		System.out.println(name);
		
	}
}
