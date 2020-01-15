package MyProgrammes;

class Even extends Thread
{
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			try {
				Thread.sleep(2000);
				if(i%2==0)
					System.out.println("Even Thread : "+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Odd extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			try {
				Thread.sleep(2000);
				if(i%2!=0)
					System.out.println("Odd Thread : "+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadExample2 {

	public static void main(String[] args) {
	
		Even t1=new Even();
		Odd t2=new Odd();
		
		t1.start();
		t2.start();

	}

}
