package MyProgrammes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExample2 {

	public static void main(String[] args) {
		Set <Integer> s1=new HashSet<Integer>();
		// HashSet is an implementation class of Set interface
		// HashSet is unordered set class
		
		s1.add(110);
		s1.add(102);
		s1.add(114);
		s1.add(114);
		s1.add(110);
		s1.add(115);
		
		System.out.println(s1);
		
		TreeSet<Integer> t=new TreeSet<Integer>(s1);
		// TreeSet is an implementation class of Set interface
		// TreeSet is Ordered set Class
		
		System.out.println();
		System.out.println(t);
		
		//*************************************************************
		// methods of HashSet Class
		
		HashSet<String> s2=new HashSet<String>();
		
		s2.add("Ajay");
		s2.add("Vijay");
		s2.add("Ajay");
		s2.add("Suresh");
		s2.add("Rahul");
		s2.add("John");
		s2.add("Mike");
		s2.add("Rohit");
		
		System.out.println(s2);
	
		System.out.println("Size of Set : "+s2.size());
		
		System.out.println("Set Empty ? "+s2.isEmpty());
		
		//Access the set elements using iterator
		
	    Iterator<String> it1=s2.iterator();
	    
	    while(it1.hasNext())
	    {
	    	System.out.print(it1.next()+" ");
	    }
	    
	    //Removing element from the Set
	    
	    System.out.println();
	    s2.remove("Ajay");
	    System.out.println(s2);
	    
		HashSet<String> s3=new HashSet<String>();
		s3.add("Manish");
		s3.add("Atul");
		s3.add("Neeraj");
		s3.add("Ravi");
		
		System.out.println(s3);
	    
		s2.addAll(s3);
		System.out.println("Updated Set : "+s2);
		System.out.println("Size of Set :"+s2.size());
		
	    if(s2.contains("Ravi"))
	    	System.out.println("Element Found");
	    else
	    	System.out.println("Element not Found");
	    
	    //*********************************************************
	    
	    ArrayList<String> fruits=new ArrayList<String>();
	    
	    fruits.add("Mango");
	    fruits.add("Orange");
	    fruits.add("Pineapple");
	    
	    System.out.println("Array List : "+fruits);
	    
	    HashSet<String> hs=new HashSet<String>(fruits);
	    
	    hs.add("Potato");
	    hs.add("Brinjal");
	    hs.add("Capsicum");
	    
	    Iterator<String> it=hs.iterator();
	    
	    System.out.println("List of Items :");
	    while(it.hasNext())
	    {
	    	System.out.println(it.next());
	    }
	    
	    //***********************************************************
	    
	   
	    
	}

}
