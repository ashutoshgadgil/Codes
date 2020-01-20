package MyProgrammes;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandling10 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("E:\\f10.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		
		int data=bis.read();
		
		while(data!=-1)
		{
			System.out.print((char)data);
			data=bis.read();
		}
	}

}
