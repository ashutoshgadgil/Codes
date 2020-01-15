package MyProgrammes;
// Multilevel Inheritance
class Symbols
{
	protected char sym;
	public Symbols ()
	{
		sym='+';
	}
}
class letters extends Symbols 
{
	protected char alpha;
	public letters()
	{
		alpha='A';
	}
}
class numbers extends letters
{
	protected int num;
	public numbers()
	{
		num=100;
	}
}

public class MultilevelInherit {

	public static void main(String[] args) {
		
		numbers n=new numbers();
		System.out.println(n.alpha +" "+n.sym +" "+n.num );
	}

}
