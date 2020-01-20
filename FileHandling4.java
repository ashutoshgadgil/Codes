package MyProgrammes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling4 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream(new File("E:\\f3.txt"));
		
		fos.write(65);
		fos.write('B');
		System.out.println("File Saved successfully");
		fos.close();
	}

}
