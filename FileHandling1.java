package MyProgrammes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileHandling1 {

	public static void main(String[] args) {
		
		
		File f=new File("E:\\abc.txt");     // Create a File stream 
		OutputStream out;                   // Create OutputStream reference
		byte numbers[]= {10,20,30,40,50};   // Create byte array to be written in File abc.txt
		try {
			  out=new FileOutputStream(f);   // Create Object of FileOutputStream 
			
			for(int i=0;i<numbers .length ;i++)  // loop to write every integer of array to abc.txt
			{
				try {
					out.write(numbers[i]);    // Write() writes numbers to file using file stream out
					} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("File saved successfully");
			
			try {
				out.close();              // Closes the file
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
				e.printStackTrace();
		}
		
		try {
			
			
	         InputStream is = new FileInputStream("E:\\abc.txt");
	         int size;
			try {
				size = is.available();
				 for(int i = 0; i < size; i++) {
			            System.out.print(is.read() + "  ");
			         }

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	        
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
