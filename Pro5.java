package MyProgrammes;

class Max
{
	public int N1(int m)
	{
		return m;
	}
	
	public int N2(int n)
	{
		return n;
	}
	
	public void comp(int n1,int n2)
	{
		if(N1(n1)>N2(n2))
			System.out.println(n1 + " is greater");
		else
			System.out.println(n2 + " is greater");
	}
}

public class Pro5 {

	
	public static void main(String[] args) {
		Max m=new Max();
		m.comp(50, 20);
	}

}
