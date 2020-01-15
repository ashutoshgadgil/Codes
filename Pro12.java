package MyProgrammes;

import java.util.Scanner;

public class Pro12 {

	private String fname,lname;
	Scanner s;
	private double percentage;	
	
	public void get()
	{
		s=new Scanner(System.in );
		System.out.println("Enter First Name :");
		fname =s.nextLine();
		
		System.out.println("Enter Last Name :");
		lname=s.nextLine();
		
		System.out.println("Enter Percentage");
		percentage =s.nextDouble();
		
	}
	
	public void displayFullName()
	{
		System.out.println(fname+" "+lname+" "+percentage );
	}
	
	public static void main(String[] args) {
		Pro12 p=new Pro12();
		p.get();
		p.displayFullName();
	}

}
