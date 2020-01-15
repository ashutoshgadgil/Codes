package MyProgrammes;

class Sender
{
	public void send(String msg)
	{
		System.out.println("Sending...."+msg);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Sent "+msg);
	}
}

class myThread7 extends Thread
{
	Sender sen;
	String message;

	public myThread7(String msg,Sender s)  // myThread7 t1=new myThread7("hi",s);
	{
		sen=s;
		message=msg;
	}
	
	public void run()
	{
		synchronized (sen) {    // Synchronized block
			sen.send(message);
		}
		
	}
}

public class Threadexampl6 {

	public static void main(String[] args) {
		Sender s=new Sender();
		
		myThread7 t1=new myThread7("Hi", s);
		
		myThread7 t2=new myThread7("Hello", s);
		
		myThread7 t3=new myThread7("", s);
		
		t1.start();
			
		t2.start();
		
/*		
try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
		*/

	}
	

}
