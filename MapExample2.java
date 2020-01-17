package MyProgrammes;

import java.util.HashMap;
import java.util.Scanner;

class Result
{
	HashMap<Integer ,Double > hm;
	
	public Result()
	{
		hm=new HashMap<Integer, Double>();
	}
	
	public void getResult()
	{
		Scanner s=new Scanner(System.in);
		int roll;
		
		hm.put(101,97.8);
		hm.put(102,87.8);
		hm.put(103,77.5);
		hm.put(104,92.7);
		hm.put(105,93.4);
		
		System.out.println("Enter Roll no :");
		roll=s.nextInt();
		
		int temp=0;
				
		System.out.print("Result :");
		for ( Integer  key : hm.keySet() ) {
		    
		    if(roll==key)
			{
				temp=1;
				System.out.println(hm.get(roll));
				break;
			} 
		}
		
		if(temp==0)
			System.out.println("Roll No not Found");
	}
}

public class MapExample2 {

	public static void main(String[] args) {
		Result r=new Result();
		r.getResult();
	}

}
