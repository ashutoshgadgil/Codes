package MyProgrammes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling14 {

	public static void main(String[] args) throws IOException {
		FileOutputStream o1=new FileOutputStream("E:\\numbers.txt");
		
		byte num[]= {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0;i<10;i++)
		{
			o1.write(num[i]);
		}
		
		o1.close();
		
		FileInputStream fi=new FileInputStream("E:\\numbers.txt");
		
		int i=fi.read();
		
		while(i!=-1)
		{
			if(i%2==0)
				System.out.print(i+" ");
			i=fi.read();
		}
		
		fi.close();
		o1.close();
	}

}
