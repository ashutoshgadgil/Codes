package MyProgrammes;

import java.util.Scanner;

class UserException extends Exception{      // UserException is a custom Exception
 	
	public UserException(String message)
	{
		super(message);
	}
}

public class CustomExceptionExample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System .in);
		System.out.println("Enter any number :");
		int number=s.nextInt();
		
		try {
			if(number <50)
				throw new UserException("User Exception Thrown : Number entered less than 50");
			else
				System.out.println("You enter a number That is valid and more than 50");
		} catch (UserException  e) {
			System.out.println(e.getMessage());
		}

	}

}
