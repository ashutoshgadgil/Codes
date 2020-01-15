package MyProgrammes;

import java.util.Scanner;

public class Pro11 {

	private int n1,n2,n3;
	Scanner s;
	
	public void add()
	{
		s=new Scanner(System .in );
		System.out.println("Enter first no :");
		n1=s.nextInt();
		
		System.out.println("Enter Second no :");
		n2=s.nextInt();
		
		n3=n1+n2;
		
		System.out.println("Sum : "+n3);
		
	}
	
	public static void main(String[] args) {
	Pro11 p=new Pro11();
	p.add();

	}

}
