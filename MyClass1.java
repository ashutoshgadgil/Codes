package MyProgrammes;

public class MyClass1 {     // Class Declaration
    private int x=10;       // Instance Variable

	private static int y=20;  // Static variable
	
	public void show()       // Member function of class
	{
		System.out.println("Welcome");
	}
	
	public static void main(String[] args) {
	      int z=30;          // Local variable
	      
	      MyClass1 obj=new MyClass1();  // obj is object of class MyClass1
	      
	      obj.show();                   // Calling of member function
		
	}

}
