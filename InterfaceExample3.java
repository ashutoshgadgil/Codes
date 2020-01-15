package MyProgrammes;

import java.util.Scanner;

interface col
{
	public String source1="Bulb";
	public String source2="Tubelight";
	public String source3="LED";
}

class lights 
{
	Scanner s;
	protected String col;
	public String getColor()
	{
		s=new Scanner(System.in );
		System.out.println("Enter Color :");
		col=s.nextLine();
		return col;
	}
}

class Check extends lights implements col 
{
	
	public void checkSrc()
	{
		String c=getColor();
		if(c.equalsIgnoreCase("Red"))
			System.out.println(source1);
		else if(c.equalsIgnoreCase("White"))
			System.out.println(source2);
		else if (c.equalsIgnoreCase("Blue")) 
			System.out.println(source3);
		else
			System.out.println("Invalid color");
	}
}

public class InterfaceExample3 {

	public static void main(String[] args) {
		Check c=new Check();
		c.checkSrc();
	}

}
