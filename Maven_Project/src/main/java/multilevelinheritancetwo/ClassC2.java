package multilevelinheritancetwo;


public class ClassC2 extends ClassB2 {


		
		public void methodC2()
		{
			System.out.println("Calling Class C2");
		}
		

		public static void main(String[] args) {
			
			ClassC2 ob = new ClassC2();
			
			ob.methodC2();
			
			ob.methodB2();
			
			ob.methodA2(); 
			
		}

	}
