package MyProgrammes;

class Num
{
	private int n;
	
	public void setn(int n)
	{
		this.n =n;
	}
	
	public int getMax(Num n1)
	{
		if(this.n >n1.n )
			return this.n;
		else
			return n1.n ;
	}
}

public class Pro1 {

	public static void main(String[] args) {
		Num n1=new Num();
		Num n2=new Num();
		
		n1.setn(50);
		n2.setn(20);
		
		System.out.println("Maximum number is : "+n1.getMax(n2));
	}

}
