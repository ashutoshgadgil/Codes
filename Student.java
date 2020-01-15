package MyProgrammes;

public class Student {

	private int rollno;                     // Instance variables
	private String name;
	
	public void setData(int r,String n)     // Instance Methods
	{
		rollno =r;
		name =n;
	}
	
	public void getData()
	{
		System.out.println("Roll No : "+rollno );
		System.out.println("Name :"+name );
	}
	
	public static void main(String[] args) {
		Student s1,s2;                 // References
		s1=new Student();              // s1 is an object
		s1.setData(101,"abc");
		
		s1.getData();
		
		s2=new Student();
		s2.setData(102,"def");
		s2.getData();
		//setData(101,"abc");
		
		Student s3=new Student();
		s3.setData(103,"ghi");
		s3.getData();
		
		Student s4;
		
		s4=s1;
		s4.getData();

	}

}
