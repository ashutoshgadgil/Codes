package MyProgrammes;

class Addition
{
	private int num1,num2,num3;  // Private data members
	
	public void Add()           // Member methods
	{
		num1=20;
		num2=30;
	}
	
	public void getResult()
	{
		System.out.println(num1+num2);
	}
}

public class AccessModifiers {

	public static void main(String[] args) {
		Addition obj1,obj2;          // Creation of a reference variable
		
		obj1=new Addition();         // Dynamic memory allocation using new keyword
		obj2=new Addition();
		
		obj1.Add();
		obj2.Add();
		
		obj1.getResult();
		obj2.getResult();

	}

}
