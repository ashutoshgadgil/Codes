package MyProgrammes;

public class Pro14 {

	private int a;
	private String b;
	private double c;
	
	
	// Constructor Overloading
	
	public Pro14(int a,String b,double c)     // Parameterised constructor
	{
		this.a =a;
		this.b=b;
		this.c=c;
	}
	
	public Pro14()                            // Default Contructor 
	{
		a=104;
		b="nfd";
		c=3.4;
	}
	
	public Pro14(Pro14 p)               // Passed the object inside constructor as a parameter
	{
		this.a= p.a ;                   // this.a means the value of a for current object/ calling object
		this.b= p.b;
		this.c= p.c;
	}
	
	public static void main(String[] args) {
		Pro14 p1=new Pro14(101,"abc", 1.2);
		Pro14 p2=new Pro14(102,"def",1.3);
		Pro14 p3=new Pro14(103,"ghi",1.4);

		System.out.println(p1.a +" "+p1.b + " "+p1.c);
		System.out.println(p2.a +" "+p2.b + " "+p2.c);
		System.out.println(p3.a +" "+p3.b + " "+p3.c);
	
		Pro14 p4=new Pro14();
		System.out.println(p4.a +" "+p4.b + " "+p4.c);
		
		Pro14 p5=new Pro14(p4);
		System.out.println(p5.a +" "+p5.b + " "+p5.c);
		
	}

}
