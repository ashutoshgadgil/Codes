package MyProgrammes;

class MyThread6 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			try {
				Thread.sleep(1000);
				System.out.println("Thread Name : "+Thread .currentThread().getName()+" "+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class ThreadExampl5 {

	public static void main(String[] args) {
		MyThread6 t1=new MyThread6();
		MyThread6 t2=new MyThread6();
		MyThread6 t3=new MyThread6();
		
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		t2.start();
		
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t3.start();
		
		

	}

}
