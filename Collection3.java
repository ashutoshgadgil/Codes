package MyProgrammes;

import java.util.ArrayList;
import java.util.Scanner;

class StudentDetails
{
	ArrayList list;
	
	StudentDetails()
	{
		list=new ArrayList();
	}
	
	public void add(String item)
	{
		list.add(item);
	}
	
	public void remove(int index)
	{
		list.remove(index);
	}
	
	public void update(int pos,String item)
	{
		list.set(pos, item);
	}
	
	public void display()
	{
		for(Object names : list)
		{
			System.out.println(names .toString());
		}
	}
}

public class Collection3 {

	public static void main(String[] args) {
		StudentDetails s1=new StudentDetails();
		
		Scanner s=new Scanner(System.in);
		String name;
		int pos;
		
		s1.add("Amit");
		s1.add("Ajay");
		s1.add("Sachin");

		System.out.println("List of Students :");
		s1.display();
		
		System.out.println("Enter name to update :");
		name=s.nextLine();
		System.out.println("Enter position :");
		pos=s.nextInt();
		
		s1.update(pos, name);
		System.out.println("Updated list is :");
		s1.display();
		
		System.out.println("Enter position of an element to remove :");
		pos=s.nextInt();
		s1.remove(pos);
		System.out.println("Updated list is :");
		s1.display();
		
		
	}

}
