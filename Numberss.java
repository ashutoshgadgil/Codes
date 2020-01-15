package MyProgrammes;

public class Numberss {

	public void function1()
	{
		System.out.println("Welcome to Java");
	}
	
	public int function2(int x)
	{
		System.out.println(x*x);
		return x*x;
	}
	
	public String function3(String s)
	{
		return "Hello , "+s;
	}
	
	public static void main(String[] args) {
		Numberss n=new Numberss();
		
		n.function1();
		
		int square= n.function2(10);
		System.out.println("Square is :"+square );
		
		String message=n.function3("Ashutosh");
		System.out.println("Message is : "+message );
	}

}
