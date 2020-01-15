package MyProgrammes;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerExample2 {

	public static void main(String[] args) {
		String name;
		
		Scanner s=new Scanner(System .in);
		
		System.out.println("Enter Full Name :");
		name=s.nextLine();
		String tokens[]=new String[2];
	
		StringTokenizer st=new StringTokenizer(name," ");
		
		int i=0;
		int cnt=st.countTokens();
		while(i<cnt)
		{
			tokens[i]=st.nextToken();
			i++;
		}
		
		System.out.println("First Name :"+tokens[0]);
		System.out.println("Last Name :"+tokens[1]);
	}

}
