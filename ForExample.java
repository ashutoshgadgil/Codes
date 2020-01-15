package MyProgrammes;

public class ForExample {

	public void printNumbers()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
	}
	
	public void printNum()
	{
		int i=10;
		
		while(i>0)
		{
			System.out.print(i+" ");
			i=i-1;
		}
	}
	
	public void printN()
	{
		int i=1;
		do
		{
			System.out.print(i+" ");
			i++;
		}while(i<=10);
			
	}
	
	public static void main(String[] args) {
		ForExample f=new ForExample();
		f.printNumbers();
		System.out.println();
		f.printNum();
		System.out.println();
		f.printN();
	}

}
