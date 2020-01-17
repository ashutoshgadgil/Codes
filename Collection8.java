package MyProgrammes;

import java.util.LinkedList;

public class Collection8 {

	public static void main(String[] args) {
		LinkedList<String > str=new LinkedList<String>();
		
		str.add("Welcome");
		str.add("to");
		str.add("Java");
		
		String st[]=new String[3];
		
		Object s[]=str.toArray();
		for(int i=0;i<str.size();i++)
		{
			st[i]=s[i].toString();
		}
		
		System.out.println(String.join("*",st));
	}

}
