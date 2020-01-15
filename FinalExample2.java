package MyProgrammes;

class Cust
{
	private final String PANCardNo;
	
	public Cust(String p)
	{
		PANCardNo =p;
	}
	
	public void showPAN()
	{
		System.out.println("PAN Card :"+PANCardNo );
	}
	
	public final void calculate()     // final method
	{
		System.out.println("Operations performed");
	}
}

class Person extends Cust
{
	public Person(String p) {
		super(p);
		// TODO Auto-generated constructor stub
	}
	
	/* 
	public final void calculate()
	{
		System.out.println("Operations performed");
	}
	*/
	
}

public class FinalExample2 {

	
	public static void main(String[] args) {
		Cust c1=new Cust("SAEDS12345");
		Cust c2=new Cust("SSFDS14345");
		
		c1.showPAN();
		c2.showPAN();
	}

}
