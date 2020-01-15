package MyProgrammes;

class myclass
{
	private int x;
	public void show()
	{
		System.out.println("Function called...");
	}
}
public class Pro15 {

	public static void main(String[] args) {
		myclass m1=new myclass();
		myclass m2=new myclass();
		
		m1.show();
		m2.show();
		
		m2=null;
		m2=m1;
		m2.show();
		
		//int x=null;
		//String s=null;

	}

}
