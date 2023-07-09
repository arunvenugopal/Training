package discountAssignment;

public class Offseason 

{
	public void discount(double listprice)
	{
		System.out.println("The Off Season Details are as below, ");
		System.out.println("----------------------");
		System.out.println("The list price is: "+listprice);
		
		double d = 0.15*listprice;
		double offsellprice = listprice - d;
		
		System.out.println("The off season discount is: "+offsellprice);
		
		
		double r = listprice - offsellprice;
		System.out.println("The off season rate is "+r);
	
	}

}
