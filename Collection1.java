package MyProgrammes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Collection1 {

	
	public static void main(String[] args) {
		
		List l=new ArrayList();
		
		l.add("RAM");
		l.add("Hard Disk");
		l.add("CPU");
		l.add(25000);
		l.add(1.4);
		
		System.out.println("List of Items : "+l);                    // showing the list elements
		System.out.println("Second item in the list : "+l.get(1));   // get returns the element 
		                                                             // at the particular index
		System.out.println("List empty ? "+l.isEmpty());             // checks the list is empty
		System.out.println("Index of CPU : "+l.indexOf("CPU"));      // returns the index of element
		System.out.println("Item found: "+l.contains("RAM"));                       // check any item in list
		System.out.println("No of elements : "+l.size());
		
		List<Integer> m=new ArrayList<Integer>();   // Generic array list ,includes only integer 
		                                            // elements
		
		m.add(10);
		m.add(20);
		m.add(30);
	    // m.add("fgfg");     // can not add string value in list
		
		System.out.println("Integer list : "+m);
		
		l.add(m);
				
		System.out.println("Updated List : "+l);
		
		ArrayList<String> al=new ArrayList<String>();    // Create a list using ArrayList class
		
		al.add("Amit");
		al.add("Rahul");
		al.add("Rohit");
		//al.add(10);    // can not add int values in list
		
		ArrayList<String> al1=new ArrayList<String>();
		
		al1.add("Sachin");   
		al1.add("Ajit");
		
		
		al.addAll(al1);    // Adding a collection to another collection
		
		System.out.println("After adding second list : "+al);
		
		// For-Each loop to access all elements of the ArrayList
		
		System.out.println("Array List elements are :");
		for(String names : al)
		{
			System.out.print(names+"\t");
		}
		
		// Second way of accessing the ArrayList elements using iterator interface
		
		System.out.println();
		System.out.println("Array List elements accessed using Iterator :");
		
		Iterator it=al.iterator();  // Iterator is an interface used to access ArrayList elements
		
		while(it.hasNext())      // hasNaxt() returns true if there are more elements in the list
		{
			System.out.print(it.next()+"\t");   // next() returns the next element in the list
		}
		
		// Third way to access the Arraylist element
		
		ListIterator ls=al.listIterator();
		
		while(ls.hasNext())
		{
			System.out.println(ls.next());
		}
		
		System.out.println(al);
		
		ListIterator l1=al.listIterator();   // ListIterator is a bidirectional way to access
		                                     // elements in the list
		System.out.println();
		System.out.println("\nOriginal list is :");
		while(l1.hasNext())                  
		{
			System.out.print(l1.next()+" ");
		}
		
		System.out.println();
		System.out.println("\nList elements in reverse order :");
		while(l1.hasPrevious())              // hasPrevious will check for the previous element in the
		{                                    // list
			System.out.print(l1.previous()+" ");   // returning the previous element
		}
		
		System.out.println();
		System.out.println(al);
		
		al.set(3,"Manish");     // set() updates the element on the position specified as index
		                        // Replacing index 3 element with Manish
		
		System.out.println();
		System.out.println(al);
		
		al.remove(0);
		
		System.out.println("List after removing the first element :");
		System.out.println(al);
		
		
	}

}
