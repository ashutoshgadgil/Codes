package MyProgrammes;

import java.io.IOException;
// Case - 1
// If the base class method is not throwing any exception and the method is overridden
// in the child class then that overridden method can not throw the checked exception 
// but it can throw the unchecked exception

class base1
{
	public void show() 
	{
		System.out.println("This is base class function message");
	}
}

class derived1 extends base1
{
	public void show() throws ArithmeticException                     //Overridden method
	{
		//super.show();
		System.out.println("This is derived class function message");
	}
}

public class ExceptionInOverriding1 {

	public static void main(String[] args) {
		derived1 d=new derived1();
		d.show();
	}

}
