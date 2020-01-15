package MyProgrammes;

public class Welcome {
	private String message1;       // Instance variable
	protected String message2;
	public String message3;
	
	public void showData()
	{
		message1 ="Hello";
		message2 ="Hi";
		message3 ="Welcome";
		
		System.out.println(message1 +" "+message2 +" "+message3 );
	}
}
