package MyProgrammes;

public class StaticMethod {

	private int rollno;
	private static String College;
	 
	StaticMethod (int rollno)
	{
		this.rollno =rollno ;
	}
	
    public static String setCollege()       // static method sets the college name for
    {                                       // all objects where static data member is College
    	College ="abc";                     // College name sets a common name to all objects
    	return College;
    	//rollno=1;                         // Rollno not accessible because of non static data member
    }
    
    public void showDetails()               // To show details of each student
    {
    	System.out.println("Rollno : "+rollno +" College Name :"+College);
    }
	
	public static void main(String[] args) {
		StaticMethod obj1=new StaticMethod(101);    // Calling Parameterised Constructor
		StaticMethod obj2=new StaticMethod(102);    // to assign Rollno for each object
		StaticMethod obj3=new StaticMethod(103);
		
		StaticMethod .setCollege();      // Call static method with class name
		
		obj1.showDetails();              // calling of showDetails() method by objects
		obj2.showDetails();
		obj3.showDetails();

		
	}

}
