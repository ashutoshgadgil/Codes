package MyProgrammes;

// Case-2
// If the base class method throws an exception and this method is overridden by the child class
// then the child class overridden method can not throw the exception of the superclass but it can
// throw the exception of the child class

class base2
{
	public void show() throws ArithmeticException 
	{
		System.out.println("Show of base called");
	}
}

class derived2 extends base2
{
	public void show() throws ArithmeticException
	{
		System.out.println("Show of derived called");
	}
}

public class ExceptionOverridingExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
