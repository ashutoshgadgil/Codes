package MyProgrammes;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling8 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos1=new FileOutputStream("E:\\f5.txt");
		
		FileOutputStream fos2=new FileOutputStream("E:\\f6.txt");

		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		
		bos.write(65);
		bos.writeTo(fos1);
		bos.writeTo(fos2);
		
		bos.close();
		
	}

}
