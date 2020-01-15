package MyProgrammes;

class Factorial
{
	public int getFactorial(int n)
	{
		int f=1;
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		return f;
	}
}

public class Pro2 {

	public static void main(String[] args) {
		Factorial f=new Factorial();
		System.out.println("Factorial : "+f.getFactorial(5));
	}

}
