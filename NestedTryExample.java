package MyProgrammes;

import java.util.Scanner;

class Candidate
{
	private int age;
	private String name;
	Scanner s;
	
	public void checkAge()
	{
		s=new Scanner(System .in);
		try {
			
			System.out.println("Enter your age :");
			age =s.nextInt();
			
			if(this.age==0)
				throw new ArithmeticException();
			else
			{
				System.out.println("Welcome you are :"+this.age );
			    System.out.println("What is your name ?");
			    s.nextLine();
			    name =s.nextLine();
			    
			    if(name.length()==0)
			    	throw new NullPointerException();
			    else
			    	System.out.println("Your name : "+name );
			}
			try {
				if(this.age<18)
					throw new ArithmeticException();
				else
					System.out.println("You are elegible to vote");
			} 
			
			
			catch (Exception e) {
				System.out.println("You are minor");
			}
			
			
		} catch (ArithmeticException e) {
			System.out.println("Age can not be zero");
		}
		catch (Exception e) {
			System.out.println("Name can not be null");
		}
		finally
		{
			System.out.println("End of Program");
		}
	}
}
public class NestedTryExample {

	public static void main(String[] args) {
		Candidate c=new Candidate();
		c.checkAge();
	}

}
