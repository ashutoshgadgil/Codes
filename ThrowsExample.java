package MyProgrammes;

import java.io.IOException;

class MyExceptionClass
{
	public void m() throws IOException
	{
		//try {
			n();
		//} catch (Exception e) {
		//	System.out.println("This is an Exception");
		//}
		
	}

	public void n() throws IOException
	{
		p();
	}
	
	public void p() throws IOException
	{
		//try
		//{
		    throw new IOException("Exception raised in P");

		//}
		//catch(IOException e)
		//{
		//	System.out.println("My Exception :"+ e.getMessage());
		//}
	}
}


public class ThrowsExample {

	public static void main(String[] args) throws IOException {
	
		MyExceptionClass m=new MyExceptionClass();

		//try {
			m.m();
		//} catch (IOException e) {
			System.out.println("Some Error occured in a method");
		//}
		
	}

}
