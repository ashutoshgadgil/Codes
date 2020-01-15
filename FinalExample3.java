package MyProgrammes;


final class Operations 
{
	public int getNum(int x)
	{
		return x*x;
	}
}

public class FinalExample3{

	public static void main(String[] args) {
		Operations ob=new Operations();
		System.out.println(ob.getNum(10));
	}

}
