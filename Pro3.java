package MyProgrammes;

class Alphabets
{
	public void printAlphabets()
	{
		for(int i=65;i<=90;i++)
		{
			System.out.print((char)i +" ");
		}
	}
}

public class Pro3 {

	public static void main(String[] args) {
		Alphabets a=new Alphabets();
		a.printAlphabets();

	}

}
