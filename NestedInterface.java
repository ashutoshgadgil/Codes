package MyProgrammes;

interface drawable                // Outer Interface
{
	public void printIt();
	
	interface Printable           // Nested Interface / Inner Interface
	{
		public void showIt();
	}
}

class Drawing implements drawable, drawable.Printable
{
	@Override
	public void showIt() {
		System.out.println("Drawing Circle");
	}
   
	@Override
	public void printIt() {
		System.out.println("Drawing Rectangle");
	}	
}

public class NestedInterface {

	public static void main(String[] args) {
		Drawing d=new Drawing();
		d.showIt();
		d.printIt();
	}

}
