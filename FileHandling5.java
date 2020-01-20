package MyProgrammes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling5 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream(new File("E:\\f4.txt"));
		
		String data="Welcome to Java I/O";
		
		byte b[]=data.getBytes();  // getBytes() used to convert a string into byte array
		
		fos.write(b);    // file will be written in bytes
		
		System.out.println("File written successfully");
		
		fos.close();
		
		FileInputStream fis=new FileInputStream(new File("E:\\f4.txt"));
		
		int i=fis.read();
		
		while(i!=-1)
		{
			System.out.print((char)i+"");
			i=fis.read();
		}
		
		fis.close();
	}

}
