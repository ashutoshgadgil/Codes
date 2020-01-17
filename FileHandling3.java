package MyProgrammes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling3 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos;
		FileInputStream fis;
		
		fos=new FileOutputStream(new File("E:\\f2.txt"));
		char alpha[]= {'A','B','C','D','E'};
		
		for(int i=0;i<alpha .length;i++)
		{
			fos.write(alpha[i]);
		}
		fos.close();
		
		fis=new FileInputStream(new File("E:\\f2.txt"));
		
		int c=fis.read();
		
		while(c!=-1)
		{
			System.out.print((char)c+" ");
			c=fis.read();
		}
		fis.close();
	}

}
