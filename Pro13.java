package MyProgrammes;

public class Pro13 {

	private int x;
	private String y;
	private double z;
	
	public Pro13()        // Default Constructor
	{
		x=10;
		y="Hello";
		z=1.5;
	}
	
	public static void main(String[] args) {
		
		Pro13 p=new Pro13();
		Pro13 p1=new Pro13();
		Pro13 p2=new Pro13();
		
		System.out.println(p.x+" "+p.y +" "+p.z );
		System.out.println(p1.x+" "+p1.y +" "+p1.z );
		System.out.println(p2.x+" "+p2.y +" "+p2.z );
		
	}

}
