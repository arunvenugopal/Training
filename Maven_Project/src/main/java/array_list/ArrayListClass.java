package array_list;

import java.util.*;   // to get the ArrayList class

public class ArrayListClass 

{

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
		ArrayList<String> ob = new ArrayList<String>();   // creating ArrayList
		
		ob.add("Arun");   // method to add elements into ArrayList
		ob.add("Vishnu");
		ob.add("Prabhitha");
		ob.add("Sony");
		System.out.println(ob);
		
		
		ob.remove(0);// method to remove an item from the ArrayList
		System.out.println(ob);
		
		
		
		System.out.println("The size is: "+ob.size()); // method to find the size of ArrayList
		
		
		System.out.println("The value in index position 2 is: "+ob.get(2));
		

	}

}
