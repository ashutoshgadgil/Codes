package MyProgrammes;

public class Pro10 {

	public static void function()    // Static method, can be called directly in main
	{
			System.out.println("Welcome to Java");
	}
	
	public void function2()          // Non static method, can not be called without object in main
	{
		System.out.println("Java is Interesting");
	}
	
	public static void main(String[] args) {
		function();
		
		Pro10 p=new Pro10();
		p.function2();
	}

}
