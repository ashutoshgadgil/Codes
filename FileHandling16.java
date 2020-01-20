package MyProgrammes;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class Results
{
	private double marks[],sum=0.0,per;
	private String name;
	Scanner s;
	FileOutputStream f;
	
	public Results()
	{
		s=new Scanner(System.in);
		marks=new double[5];
	}
	
	public void getData()
	{
		System.out.println("Enter name :");
		name=s.nextLine();
		
		s.nextLine();
		
		System.out.println("Enter Marks :");
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=s.nextDouble();
			sum=sum+marks[i];
		}
		
		per=sum/5;
		s.nextLine();
	}
	
	public void saveData() throws IOException
	{
		f=new FileOutputStream("E:\\Result.txt",true);
		
		f.write(name.getBytes());
		f.write(String.valueOf(per).getBytes());
		System.out.println("Data Saved Successfully....");
	}
}

public class FileHandling16 {

	public static void main(String[] args) throws IOException {
		Results r[]=new Results[3];
		
		for(int i=0;i<r.length;i++)
		{
			r[i]=new Results();
			r[i].getData();
			r[i].saveData();
		}
	}

}
