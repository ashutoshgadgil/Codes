package MyProgrammes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling2 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos;
		FileInputStream fis;
		
		fos=new FileOutputStream(new File("E:\\f1.txt"));
		byte numbers[]= {1,2,3,4,5};
		fos.write(numbers);
		fos.close();
		
		fis=new FileInputStream(new File("E:\\f1.txt"));
		int i=fis.read();
		
		while(i!=-1)
		{
			System.out.print(i+" ");
			i=fis.read();
		}
	}

}
