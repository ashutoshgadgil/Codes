package MyProgrammes;
class Employee
{
	private int eid;
	public void getDetails()
	{
		eid=10;
	}
	
	public void showDetails()
	{
		System.out.print(eid+" ");
		Address o=new Address();
		o.getData();
	}
	
	class Address
	{
		private int fno;
		private String city;
		
		public void getData()
		{
			fno=101;
			city="Pune";
			System.out.println(fno+" "+city);
		}
	}
}

public class Que1 {

	public static void main(String[] args) {
		Employee o=new Employee();
		o.getDetails();
		o.showDetails();
	}

}
