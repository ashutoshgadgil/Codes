package MyProgrammes;

class Alpha1 extends Thread
{
	public void run()
	{
		int ch=97;
		for(int i=0;i<26;i++)
		{
			System.out.println((char)ch);
			ch++;
			try {
				Thread .sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Nums extends Thread
{
	public void run()
	{
		for(int i=1;i<=50;i++)
		{
			if(i%2==0)
				System.out.println(i);
			try {
				Thread .sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadExampl3 {

	public static void main(String[] args) {
		Alpha1 t1=new Alpha1();
		Nums t2=new Nums();
		
		t1.start();
		t2.start();

	}

}
