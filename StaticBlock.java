package MyProgrammes;

public class StaticBlock {

	public static int x;
	public int y;
	
	static     
	{
		x=50;
		System.out.println("x = "+x);
	}
	
	public static void main(String[] args) {
		System.out.println("In Main");
	}

}
