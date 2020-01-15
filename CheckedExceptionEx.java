package MyProgrammes;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedExceptionEx {

	PrintWriter pw;
	
	CheckedExceptionEx()
	{
		try {
			pw=new PrintWriter("E:\\file11.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		
		CheckedExceptionEx c=new CheckedExceptionEx();
		c.pw.println("Hello");
		c.pw .close();
		System.out.println("File saved");

	}

}
