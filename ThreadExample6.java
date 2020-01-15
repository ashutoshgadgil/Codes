package MyProgrammes;

class Mythread9 extends Thread
{
	public void run()
	{
		if(Thread .currentThread().getName().equals("even"))
		{
			for(int i=0;i<10;i++)
				if(i%2==0)
					System.out.println(i);
		}
		
		if(Thread .currentThread().getName().equals("odd"))
		{
			for(int i=0;i<10;i++)
				if(i%2!=0)
					System.out.println(i);
		}
	}
}

public class ThreadExample6 {

	public static void main(String[] args) {
		Mythread9 t1=new Mythread9();
		Mythread9 t2=new Mythread9();
		
		t1.start();
		t2.start();

		t1.setName("even");
		t2.setName("odd");
	}

}
