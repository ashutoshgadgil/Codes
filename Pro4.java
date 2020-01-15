package MyProgrammes;

class Reverse
{
	public void rev(int n)
	{
		int r;
		int s=0;
		while(n!=0)
		{
			r=n%10;
			s=s+r;
			System.out.print(r);
			n=n/10;
		}
		
		System.out.println("\nSum of digits :"+s);
	}
}

public class Pro4 {

	public static void main(String[] args) {
		Reverse r=new Reverse();
		r.rev(12345);

	}

}
