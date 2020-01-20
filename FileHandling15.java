package MyProgrammes;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling15 {

	public static void main(String[] args) throws IOException {
		FileOutputStream o1=new FileOutputStream("E:\\items.txt",true);

		Scanner s=new Scanner(System .in);
		System.out.println("Enter name :");
		String name=s.nextLine();
		
		byte names[]=name.getBytes();
		
		o1.write(s.nextLine().getBytes());
		o1.write(names);
		
		o1.close();
	}

}
