package MyProgrammes;


public class FinalExample1 {

	private final int x=10;  // final variable x

	private final int z;     // Blank final variable
	
	FinalExample1()
	{
		z=50;                // Assignment of Blank final variable
	}
	
	public static void main(String[] args) {
		
	    int y;
		FinalExample1 f=new FinalExample1();
		
		System.out.println(f.x);
		
		//f.x=f.x+1;
		y=f.x;
		
		System.out.println(f.z );
	}

}
