package discountAssignment;

public class Onseason extends Offseason 

{
	public void discount(double listprice)
	{
		super.discount(200.58);
		
		System.out.println();
		System.out.println("The On Season Details are as below, ");
		System.out.println("----------------------");
		System.out.println("The list price is: "+listprice);
		
		double k = 0.40*listprice;
		double onsellprice = listprice - k;
		
		System.out.println("The on season discount is: "+onsellprice);
		
		
		double l = listprice - onsellprice;
		System.out.println("The on season rate is "+l);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Onseason ok = new Onseason();
		ok.discount(200.58);

	}

}
