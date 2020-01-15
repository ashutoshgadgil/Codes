package MyProgrammes;

import java.util.ArrayList;

public class Collection2 {

	public static void main(String[] args) {
		ArrayList <Integer> a=new ArrayList<Integer>();
		
		a.add(10);
		a.add(20);
		a.add(30);
		
		System.out.println("Array List a :"+a);
		
		ArrayList <Integer> b=new ArrayList<Integer>();
		
		b.add(40);
		b.add(50);
		b.add(60);
		
		System.out.println("Array List b :"+b);
		a.addAll(2, b);
		
		System.out.println("Array List a :"+a);
		System.out.println("Array List b :"+b);
		
		b.clear();
		System.out.println("Array List b :"+b);
		
		System.out.println("Sub List :"+a.subList(3, 5));
		
		
	}

}
