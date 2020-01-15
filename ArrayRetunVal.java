package MyProgrammes;

public class ArrayRetunVal {

	/*
	public int[] getSquare(int num[])
	{
		int n[]=new int[num.length];
		int s=0;
		
		for(int i=0;i<num.length;i++)
		{
			n[i]=num[i]*num[i];
			s=s+n[i];
		}
		
		return n;
	}
	*/
	
	public int getSquare(int num[])
	{
		int n[]=new int[num.length];
		int s=0;
		
		for(int i=0;i<num.length;i++)
		{
			n[i]=num[i]*num[i];
			s=s+n[i];
		}
		
		return s;
	}
	
	public static void main(String[] args) {
		
		ArrayRetunVal o=new ArrayRetunVal();
		//int square[]=o.getSquare(new int[] {1,2,3,4,5});
		
		int n=o.getSquare(new int[] {1,2,3,4,5});
		/*for(int i=0;i<square.length ;i++)
		{
			System.out.print(square[i]+" ");
		}*/
		
		System.out.println("Sum of series : "+n);
	}

}
