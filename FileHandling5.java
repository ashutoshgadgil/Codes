package MyProgrammes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling5 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream(new File("E:\\f4.txt"));
		
		String data="Welcome to Java I/O";
		
		byte b[]=data.getBytes();
		
		fos.write(b);
		
		System.out.println("File written successfully");
		
		fos.close();
	}

}
