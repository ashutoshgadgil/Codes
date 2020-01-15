package MyProgrammes;

// Run time polymorphism / Method Overriding

class Base11
{
	public void display()                // Base class method
	{
		System.out.println("Base Method called....");
	}
}

class Derived11 extends Base11
{
	public void display()               // Derived class method
	{
		System.out.println("Derived Method called....");
	}
}

public class OverridingExample {

	public static void main(String[] args){
		Derived11 d=new Derived11();
		
		d.display();

	}

}
