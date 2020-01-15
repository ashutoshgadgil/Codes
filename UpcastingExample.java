package MyProgrammes;

import java.util.Scanner;

abstract class phone
{
	Scanner s;
	public abstract void features();
}

class smartphone extends phone
{
	protected String brand;
	protected String RAM;
	protected String OS;
	protected String processor;
	
	public void setFeatures()
	{
		s=new Scanner(System .in );
		System.out.println("Enter Brand Name :");
		brand =s.nextLine();
		
		System.out.println("Enter RAM :");
		RAM =s.nextLine();
		
		System.out.println("Enter OS :");
		OS=s.nextLine();
		
		System.out.println("Enter Processor :");
		processor =s.nextLine();
	}
	
	@Override
	public void features() {
		System.out.println("Brand            : "+brand );
		System.out.println("RAM              : "+RAM  );
		System.out.println("Operating System : "+ OS );
		System.out.println("Processor        : "+processor  );
	}
	
}

class keyPhone extends phone
{

	protected String brand;
	protected String RAM;
	protected String OS;
	protected String processor;
	protected String mob_type;
	protected String  torch;
	protected boolean yesno;
	
	public void setFeatures()
	{
		s=new Scanner(System .in );
		System.out.println("Enter Brand Name :");
		brand =s.nextLine();
		
		System.out.println("Enter RAM :");
		RAM =s.nextLine();
		
		System.out.println("Enter OS :");
		OS=s.nextLine();
		
		System.out.println("Enter Processor :");
		processor =s.nextLine();
		
		System.out.println("Enter Mobile type (Flip / Slider) :");
		mob_type =s.nextLine();
		
		System.out.println("Enter Yes/ No for Torch :");
		torch =s.nextLine();
	}
	
	@Override
	public void features() {
		System.out.println("Brand            : "+brand );
		System.out.println("RAM              : "+RAM  );
		System.out.println("Operating System : "+ OS );
		System.out.println("Processor        : "+processor  );
		System.out.println("Mobile Type      : "+mob_type   );
		
		if(torch.equalsIgnoreCase("yes"))
			yesno =true;
		else
			yesno =false;
		System.out.println("Torch            : "+yesno   );
	}
	
}

public class UpcastingExample {

	public static void main(String[] args) {
		phone p;
		smartphone s=new smartphone();
		s.setFeatures();
		p=s;              // Upcasting
		p.features();
		
		keyPhone k=new keyPhone();
		k.setFeatures();
		p=k;
		p.features();
		
	}

}
