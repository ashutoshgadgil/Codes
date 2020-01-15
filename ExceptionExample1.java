package MyProgrammes;

public class ExceptionExample1 {

	public static void main(String[] args) {
		String str=null;
		
		try             // Raises the Exception
		{
			System.out.println(str.length());   // Exception (Null Pointer Exception)

		}
		catch(NullPointerException e)    // Handles the Exception
		{
			System.out.println(e.getMessage());
			
			str="Hello";
		
		}
		
		System.out.println(str.length());
		
		System.out.println("This is not executed");


}
}