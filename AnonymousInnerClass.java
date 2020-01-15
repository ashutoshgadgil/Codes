package MyProgrammes;

abstract class Products
{
	public abstract void showProducts();
}

interface readable
{
	public void readIt();
}

public class AnonymousInnerClass {

	public static void main(String[] args) {

		Products p=new Products() {    // Anonymous Inner class
			
			@Override                  // Annotation
			public void showProducts() {
				System.out.println("Product 1 : Laptop\nProduct 2: Mobile\nProduct 3 : Keyboard");				
			}
		};
		
		p.showProducts();
		
		readable r=new readable() {    // Anonymous Inner class
			
			@Override
			public void readIt() {
				System.out.println("Reading Books");	
			}
		};
		
		r.readIt();
	}

}
