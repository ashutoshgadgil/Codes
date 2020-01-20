package MyProgrammes;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling13 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream o1=new FileOutputStream("E:\\Message1.txt");
		FileOutputStream o2=new FileOutputStream("E:\\Message2.txt");
		
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		
		
		byte data[]= new byte[26];
				
		int j=0;
		for(int i=65;i<91;i++)
		{
			data[j]=(byte)i;
			j++;
		}
		
		bos.write(data);
		bos.writeTo(o1);
		bos.writeTo(o2);
		
		o2.close();
		o1.close();
		bos.close();
		
		
	}

}
