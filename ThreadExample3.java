package MyProgrammes;

class Mythread4 implements Runnable
{
	@Override
	public void run() {
		for(int i=0;i<10;i++)
			System.out.println(Thread .currentThread().getName()+" "+i);
	}	
}

public class ThreadExample3 {

	public static void main(String[] args) {
		Mythread4 t1=new Mythread4();
		Mythread4 t2=new Mythread4();
		
		Thread th1 =new Thread(t1);
		
		th1.setPriority(10);      // set the priority of the thread , use setPriority() method
		th1.start();
		th1.setName("Red");
		System.out.println(th1.getName());
		
		
		Thread th2=new Thread(t2);
		
		th2.start();
		th2.setName("Blue");
		
		
		System.out.println("Priority : "+th1.getName()+" "+th1.getPriority());
		// getPriority() method used to get the priority of the thread object
		
		System.out.println("Priority : "+th2.getName()+" "+th2.getPriority());
		
		
		System.out.println("Modified Priority : "+th1.getName()+" "+th1.getPriority());
			
		System.out.println("Daemon Thread : "+th1.isDaemon());
		// isDaemon() returns true or false based on the thread , if the thread
		// is daemon or not. Daemon thread is service provider thread. It 
		// terminates after terminating all threads of the program
		
		
		th1.setDaemon(true);
	
		System.out.println("Daemon Thread : "+th1.isDaemon());
		
	}

}
