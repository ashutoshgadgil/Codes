package MyProgrammes;

import java.io.IOException;
import java.util.Scanner;

public class SwitchCaseExample {

	public static void main(String[] args) {
		String choice;
		Scanner s=new Scanner(System.in);
		
		char ch;
		ch='y';
		
		System.out.println("Color Choice :\n1. Red \n2. Blue \n3. Green \n");
		
		while(ch!='n')
		{
			System.out.println("Enter Choice :");
			choice =s.nextLine();
		switch (choice) {
		case "Red":
			System.out.println("Color is Red");
			break;

		case "Green":
			System.out.println("Color is Green");
			break;
			
		case "Blue":
			System.out.println("Color is Blue");
			break;
			
		default:
			System.out.println("Color is Invalid");
			break;
		}
		System.out.println("Want to select again(y/n) :");
		
		try {
			ch=(char)System .in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		s.nextLine();
		
		}
	}

}
