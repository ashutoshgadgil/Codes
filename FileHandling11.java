package MyProgrammes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class FileHandling11 {

	public static void main(String[] args) throws IOException {
		FileInputStream f1=new FileInputStream("E:\\f2.txt");
		FileInputStream f2=new FileInputStream("E:\\f3.txt");
		
		SequenceInputStream si=new SequenceInputStream(f1,f2);  // Reads two files into single stream
		
		int i=si.read();
		
		while(i!=-1)
		{
			System.out.print((char)i);
			i=si.read();
		}
		
		si.close();
		f1.close();
		f2.close();

	}

}
