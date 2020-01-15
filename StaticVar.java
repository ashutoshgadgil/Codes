package MyProgrammes;

class customers
{
	private static int total_cust;
	
	public customers()
	{
		
		total_cust++;
	}
	
	public void showCust()
	{
		System.out.println("Total customers :"+total_cust );
	}
}

public class StaticVar {

	public static void main(String[] args) {
		customers c1=new customers();
		customers c2=new customers();
		customers c3=new customers();
		
		c3.showCust();
		
	}

}
