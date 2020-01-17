package MyProgrammes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Collection6 {

	public static void main(String[] args) {
		LinkedList<Character> l=new LinkedList<Character>();

		//l.add('s');
		//l.add('a');
		
		//System.out.println(l);
		//Collections .sort(l);
		//System.out.println(l);
		
		String str="Hello";
		
		char ch;
		
		Character c;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			c=ch;
			l.add(c);
		}
		
		Iterator it=l.iterator();
		
		for(Object o:l)
		{
			System.out.print(o);
		}
	    
		
		Collections.sort(l);
		
		int i=l.size();
		int j=0;
		int k=1;
		while(i>0)
		{
			if(l.get(j)<l.get(k))
			{
				
			}
			i--;
		}
		
		System.out.println(l);
		
	}

}
