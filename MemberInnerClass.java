package MyProgrammes;

class Outer1                              // Outer Class
{
	private int x;                     // Members of Outer class
	
	public void function()
	{
		x=500;
		System.out.println("Outer function called "+x);
	}
	
	class inner1                            // Member Inner Class
	{
		private int y;                 // Members of Inner class
		
		public void show()
		{
			y=1000;
			System.out.println("Inner Class function called");
			System.out.println(x);
			System.out.println(y);
		}
	}
	
}

public class MemberInnerClass {

	public static void main(String[] args) {
		Outer1 obj1=new Outer1();  // Object of outer class
		
		Outer1 .inner1 obj2=obj1.new inner1();  // Object of inner Class

		obj1.function();   // Outer class method called
		
		obj2.show();       // Inner class method called
	}

}
