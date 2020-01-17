package MyProgrammes;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		LinkedList l2=new LinkedList();
		
		l1.add("Hello");
		l1.add("Welcome");
		l1.add("Bye");
		
		StringBuffer sb[]=new StringBuffer[3];
		
		System.out.println("Linked list 1 :");
		for(Object o : l1)
		{
			System.out.print(o+" ");
		}
		
		for(int i=0;i<l1.size();i++)
		{
			sb[i]=new StringBuffer();
			
			sb[i].append(l1.get(i));
			sb[i].reverse();
			
			l2.add(sb[i]);
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Linked List 2 :");
		for(Object  s:l2)
		{
			System.out.print(s+" ");
		}
		
		
	}

}
