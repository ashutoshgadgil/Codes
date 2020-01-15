package MyProgrammes;

public class ArrayExample {

	public static void main(String[] args) {
		int[] x;
		int []y;
		int z[];       // Declaration of Array variable

		z=new int[3];  // Instantiation of Array variable
		
		z[0]=10;
		z[1]=20;
		z[2]=30;
		//z[3]=40;
		
		System.out.println(z[0]+" "+z[1]+" "+z[2]);
		
		for(int i=0;i<z.length;i++)
		{
			System.out.print(z[i]+" ");
		}
		
		// For Each-loop , Used to iterate or access the array elements
		System.out.println();
		for(int j:z)                     // for(datatype varname : arrayname) { } 
		{
			System.out.print(j+" ");
		}
		
		// Array of Characters
		
		System.out.println();
		char alpha[]=new char[5];
		
		alpha[0]='H';
		alpha[1]='e';
		alpha[2]='l';
		alpha[3]='l';
		alpha[4]='o';

		for(char c:alpha)
		{
			System.out.println(c+" "+(int)c);
		}
		
		double numbers[]= {1.1,1.2,1.3,1.4,1.5};
		
		for(double d:numbers)
		{
			System.out.println(d);
		}
		
		String names[]= {"Sachin","Saurav","Rohit"};
		
		for(String n:names)
		{
			System.out.println(n);
		}
		
		
	}

}
