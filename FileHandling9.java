package MyProgrammes;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling9 {

	public static void main(String[] args) throws IOException
	{
		FileOutputStream fos=new FileOutputStream("E:\\f10.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		
		String msg="Welcome to File Handling";
		
		byte b[]=msg.getBytes();
		
		bos.write(b);
		
		bos.close();fos.close();
	}

}
