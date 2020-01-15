package MyProgrammes;

class MyThread8 extends Thread
{

	static int n[]=new int[10];
	public void run()
	{
		if(Thread .currentThread().getName().equals("even"))
		{
			for(int i=0;i<10;i++)
			{
				//if(i%2==0)
					//System.out.println(i);
				n[i]=i;
				
			}
		}
	    if(Thread.currentThread().getName().equals("odd"))
		{
	    	for(int i=0;i<10;i++)
			{
				//if(n[i]%2!=0)
					System.out.println(n[i]);
			}
		}
			
	}
}

public class ThreadExample5 {

	public static void main(String[] args) {
		MyThread8 t1=new MyThread8();
		MyThread8 t2=new MyThread8();
		
		t1.start();
		t2.start();
		
		t1.setName("even");
		t2.setName("odd");
	}

}
