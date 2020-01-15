package MyProgrammes;

//Creation of thread on extending Thread class

class Mythread1 extends Thread 
{
	public void run()                   // Running state
	{
		try {
			
			for(int i=0;i<25;i++)
			{
				System.out.println("Run method called by Thread object "+i);
		
				Thread .sleep(2000);      // Waiting state
			}
			} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
	}                                  // After completely executing the run() , thread will be
	                                   // in dead or terminated state
	
	public void show()
	{
		System.out.println("Show called");
	}
}

public class ThreadExample1 {

	public static void main(String[] args) {
		
		Mythread1 threadObject1 = new Mythread1();  // Creation of Thread (New state)
        // 	threadObject1 is a Thread object
		
		threadObject1.start();    // Runnable state
		
		//threadObject1 .show();
		
		Mythread1 threadObject2=new Mythread1();
		
		threadObject2.start();
	}

}
