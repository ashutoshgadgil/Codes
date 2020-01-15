package MyProgrammes;

abstract class Abs
{
	protected final int i;  // Blank final variable
	
	public Abs()            // Constructor in Abstract Class
	{
		i=50;               // initialization of Blank final in constructor
	}
	
}

class Der1 extends Abs
{
	public Der1()           // Derived class Constructor
	{
		super();            // Calling of super class constructor 
	}
	
	public void show()
	{
		System.out.println(i);
	}
}

public class AbstractExample1 {

	public static void main(String[] args) {
		Der1 ob=new Der1();
		ob.show();

	}

}
