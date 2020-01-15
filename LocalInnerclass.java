package MyProgrammes;

class LocalInnerEx
{
	private int c;
	
	public void outerMethod()
	{
		c=500;
		System.out.println("Outer method called");
		class localInner
		{
		
			public void show()
			{
				System.out.println("Hello "+c);
			}
		}
		
		localInner l=new localInner();
		l.show();
	}
}
public class LocalInnerclass {

	public static void main(String[] args) {
		LocalInnerEx l=new LocalInnerEx();
		l.outerMethod();

	}

}
