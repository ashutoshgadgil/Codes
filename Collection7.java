package MyProgrammes;

import java.util.LinkedList;

public class Collection7 {

	public static void main(String[] args) {
	
		LinkedList<Integer> numbers=new LinkedList<Integer>();
		
		numbers .add(10);
		numbers .add(20);
		numbers .add(30);
		numbers .add(40);
		numbers .add(50);
		
		double sum=0.0;
		
		for(int i=0;i<numbers .size();i++)
		{
			sum=sum+numbers .get(i);
		}
		
		System.out.println(sum/5);
	}

}
