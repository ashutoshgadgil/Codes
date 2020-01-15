package MyProgrammes;

import java.util.Scanner;

abstract class Author
{
	protected final int author_id;
	protected String author_Name;
	protected int books_Published;
	Scanner s;
	
	public Author(int id) {
		author_id =id;
	}
	
	public void getData()
	{
		
		s=new Scanner(System .in );
		System.out.println("Enter Name :");
		author_Name =s.nextLine();
		
		s.nextLine();
		
		System.out.println("Enter No of Books Published :");
		books_Published =s.nextInt();
		s.nextLine();
	}
	
	public abstract void displayDetails();
}

public class AbstractClassExample1 extends Author {

	
	public AbstractClassExample1(int id) {
		super(id);
	}

	public static void main(String[] args) {
		AbstractClassExample1 ob1=new AbstractClassExample1(101);
		AbstractClassExample1 ob2=new AbstractClassExample1(102);

		// Get Details
		ob1.getData();
		ob2.getData();
		
		//Display Details
		ob1.displayDetails();
		ob2.displayDetails();
	}

	@Override
	public void displayDetails() {
		System.out.println("Author ID :"+author_id );
		System.out.println("Author Name :"+author_Name);
		System.out.println("Total Bokks Published :"+books_Published );
	}

}
