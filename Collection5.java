package MyProgrammes;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Collection5 {

	public static void main(String[] args) {
		
		LinkedList<Integer> l1=new LinkedList<Integer>();
		
		// Add elements
		
		l1.add(100);
		l1.add(200);
		l1.add(300);
		l1.add(400);
		l1.add(500);
		
		System.out.println("Linked List : "+l1);
		
		l1.add(2,800);
		
		System.out.println("Linked list after adding element 800 at position 2 :"+l1);
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the element to be searched : ");
		int item=s.nextInt();
		
		if(l1.contains(item))
		{
			System.out.println("Element found");
		}
		else
		{
			System.out.println("Element not found");
		}
		
		System.out.println("First element of linked list :"+l1.getFirst());  //returns the first item
		
		System.out.println("Last element of linked list :"+l1.getLast());  //returns the last item
		
		
		System.out.println(l1.peek());   // Retrieves the head element without removing it
		
		System.out.println("List : "+l1);
		System.out.println(l1.peekFirst()); // Retrieves the first element without removing it
		System.out.println(l1.peekLast());  // Retrieves the last element without removing it
		System.out.println(l1.poll());    // Retrieves the head element and removes it
		System.out.println("List : "+l1);
		System.out.println(l1.pollFirst()); // Retrieves the first element and removes it
		System.out.println("List : "+l1);
		System.out.println(l1.pollLast());  // Retrieves the last element and removes it.
		
		l1.remove(2);   // Removes third element of the list
		
		System.out.println(l1);
		
		System.out.println(l1.indexOf(800));
		System.out.println("Updated list is :"+l1);
		
		l1.addFirst(20);    // adds element at the first position
		l1.addLast(50);     // adds element at the last position
		
		System.out.println("Updated list is :"+l1);
		
		System.out.println(l1.get(1));
		
		//****************Accessing of elements using Iterator******************
		
		Iterator it=l1.iterator();
		
		System.out.println("Linked List :");
		while(it.hasNext())
		{
			System.out.print(it.next()+"\t");
		}
		
		System.out.println();
		System.out.println("Updated List :");

		//****************Accessing of elements using For Each******************
		for(Object ob:l1)
		{
			System.out.print(ob+"\t");
		}
		
		System.out.println("\nAfter deleteing the first element from linked list");
		l1.pop();          // Pop deletes the first element of linked list
		
		System.out.println(l1);
		
		System.out.println("After Adding element at the first position of Linked list");
		l1.push(500);     // Push adds the element at the first position of linked list
		
		System.out.println("Linked List1 : "+l1);
		
		LinkedList<Integer> l2=new LinkedList<Integer>();
		
		l2=(LinkedList )l1.clone();	   // Copies one linked list to another linked list
		System.out.println("Linked List2 : "+l2);
		
		
		// Access List elements using List Iterator in Reverse Order
		ListIterator<Integer> ls=l2.listIterator();
		
		for(Object ob1:l2)
		{
			ls.next();
		}
		
		System.out.println("\nLinked List in Reverse order :");
		while(ls.hasPrevious())
		{
			System.out.print(ls.previous()+" ");
		}
		
		System.out.println("\n\nList");
		System.out.println(l2);
		
		//**************************************************************************
		//*********Use of descendingIterator()**************************************
		
		Iterator itr=l2.descendingIterator();
		System.out.println("List in Reverse order using descendingIterator");
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
		//*************************************************************************
		
		LinkedList<Integer> l4=new LinkedList<Integer>();
		l4.add(25);
		l4.add(30);
		l4.add(35);
		l4.add(40);
		l4.add(200);
		l4.add(300);
		
		System.out.println();
		System.out.println("List 4 :"+l4);
		System.out.println();
		System.out.println("Original list : "+l2);
		l2.addAll(l4);
		
		System.out.println();
		System.out.println("Updated list : "+l2);
		
		l2.retainAll(l4);  // adds all elements of l4 into l2 ,only common elements of l2 will be
		                   // added in l2
		System.out.println();
		System.out.println("Updated list : "+l2);
		
		//************************************************************************
		System.out.println();
		Collections.sort(l2);    // Sort() method sorts the elements of the list l2
		System.out.println("Sorted collection :"+l2);
		
		//************************************************************************
		System.out.println();
		l2.removeLastOccurrence(300);
		System.out.println("Updated list :"+l2);
		
		//************************************************************************
		// Covert collection(LinkedList) to array
		
		System.out.println();
		Object o[]=l2.toArray();
		System.out.println(l2);
		
		int x[]=new int[o.length];
		for(int i=0;i<o.length;i++)
		{
			x[i]=Integer.parseInt(o[i].toString());
		}
		
		System.out.println("Array elements are :");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
	}

}
