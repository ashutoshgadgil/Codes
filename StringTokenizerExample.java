package MyProgrammes;

import java.util.StringTokenizer;

public class StringTokenizerExample {  

	public static void main(String[] args) {
		String message="Welcome to String Handling Programming";
		
		StringTokenizer st=new StringTokenizer(message," ");   // Create object of StringTokenizer class

		System.out.println(st.countTokens());    // countTokens() counts tokens / Words
		
		int i=0;
		
		while(st.hasMoreTokens())       // Returns boolean value true if the string has more tokens
		{
			System.out.println(st.nextToken());   // nextToken returns the token
			
			i++;                        // i counts the no of words
		}
		
		System.out.println("Total words in the string : "+i);
	}

}
