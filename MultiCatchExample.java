package MyProgrammes;

class Students
{
	private String name;
	private byte age;
	
	public void checkDetails()
	{
		try
		{
			age=10;
			name=null;
			
			
			if(age==0)
				throw new ArithmeticException();  // throw manually throws exception
     		
			if(name==null)
				throw new NullPointerException();
			
			System.out.println("Name :"+name +" Age :"+age );
		}
		catch(ArithmeticException e)
		{
			System.out.println("Age can not be 0");
		}
		catch (NullPointerException e) {
			System.out.println("Name can not be null");
		}
	}
}

public class MultiCatchExample {

	public static void main(String[] args) {
		Students s=new Students();
		s.checkDetails();

	}

}
