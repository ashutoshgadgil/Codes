package MyProgrammes;

import java.util.Scanner;

interface Bikes
{
	public int MaxSpeed=200;   // interface member variable 
	                           // By default public, static, final
	String brand="Honda";
	
	public void getBikeDetails();  // Member methods of interface
	public void showBikeDetails(); // By default public, Abstract
}

class Splender implements Bikes
{
	private String bname;
	private int engineCC;
	Scanner s;
	
	@Override
	public void getBikeDetails() {
		s=new Scanner(System .in );
		
		System.out.println("Enter Bike name :");
		bname=s.nextLine();
		
		s.nextLine();
		System.out.println("Enter CC :");
		engineCC =s.nextInt();
	}

	@Override
	public void showBikeDetails() {
		System.out.println("Bike Name      :"+bname);
		System.out.println("Bike Engine    :"+engineCC );
		System.out.println("Bike Brand     :"+Bikes .brand);
		System.out.println("Bike Max Speed :"+Bikes .MaxSpeed);
	}
	
}

class Shine implements Bikes
{

	private String bname;
	private int engineCC;
	private String color;
	Scanner s;
	@Override
	public void getBikeDetails() {
		s=new Scanner(System .in );
		
		System.out.println("Enter Bike name :");
		bname=s.nextLine();
		
		System.out.println("Enter Bike Color :");
		color =s.nextLine();
		
		s.nextLine();
		System.out.println("Enter CC :");
		engineCC =s.nextInt();
		
	}

	@Override
	public void showBikeDetails() {
		System.out.println("Bike Name      :"+bname);
		System.out.println("Bike Engine    :"+engineCC );
		System.out.println("Bike Brand     :"+Bikes .brand);
		System.out.println("Bike Max Speed :"+Bikes .MaxSpeed);
		System.out.println("Bike Color     :"+color  );

	}
	
}

public class InterfaceExample1 {


	
	public static void main(String[] args) {
		Bikes ob;
		Splender s=new Splender();
		Shine sh=new Shine();
		Scanner sc=new Scanner(System .in );
		System.out.println("Which Bike you want (Shine / Splender) ? ");
		String bk=sc.nextLine();
		
		
		
		ob=sh;
		ob.getBikeDetails();
		ob.showBikeDetails();
	}

}
