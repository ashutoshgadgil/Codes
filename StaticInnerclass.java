package MyProgrammes;

class OuterClass2                   // Outer class
{
	private static int x=20;
	private int y=30;
	
	static class inner1              // Static nested class
	{
		public void show()
		{
			System.out.println(x);
			//System.out.println(y);
		}
		
		static void function() {
			System.out.println("Static method called");
		}
	}
	
}
public class StaticInnerclass {

	public static void main(String[] args) {
		OuterClass2 .inner1 ob=new  OuterClass2.inner1();  // Object of static nested class
	
		ob.show();  // Accessing members of static nested class

		OuterClass2.inner1.function();
	}

}
