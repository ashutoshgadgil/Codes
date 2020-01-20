package MyProgrammes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling12 {

	public static void main(String[] args) throws IOException {
		FileOutputStream o1=new FileOutputStream("E:\\Marks.txt");
		FileOutputStream o2=new FileOutputStream("E:\\Average.txt");
		
		byte marks[]= {88,77,99,66,89};
		
		for(int i=0;i<marks.length;i++)
		{
			o1.write(marks[i]);
		}
		
		o1.close();
		
		FileInputStream f1=new FileInputStream("E:\\Marks.txt");
		
		int c=f1.read();         // read() returns an integer value as content from file
		double d=0;
		
		while(c!=-1)             // checking more contents in file until it gets -1
		{                        // -1 represents no content in the file
			d=d+c;
			c=f1.read();
		}
		
		double avg=d/5;
		String average=String.valueOf(avg);    // valueOf() converting from double value to string
		byte data[]=average.getBytes();        // getBytes() converting from String to Bytes
		o2.write("Percentage :".getBytes());
		o2.write(data);                        // Write() writing data to file as bytes array
		o2.close();                            // Close() closing the file stream
		o1.close();
	}

}
