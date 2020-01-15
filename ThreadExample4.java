package MyProgrammes;

class MyThread2 extends Thread 
{
	public void run()
	{
		System.out.println(Thread .currentThread().getName());
	}
}

public class ThreadExample4 {

	public static void main(String[] args) {
		MyThread2 obj=new MyThread2();
		obj.setName("Numbers");
		obj.start();
		
		MyThread2 obj1=new MyThread2();
		obj1.setName("Alphabets");
		obj1.start();

	}

}
