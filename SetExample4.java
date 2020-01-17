package MyProgrammes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Books implements Comparable<Books>
{
	protected int id;
	protected String bookName;
	protected String authorname;
	protected int price;
	public Books(int id, String bookName, String authorname, int price) {
		//super();
		this.id = id;
		this.bookName = bookName;
		this.authorname = authorname;
		this.price = price;
	}
	@Override
	public int compareTo(Books o) {
		if(price >o.price )
			return 1;
		else if(price <o.price)
			return -1;
		else
			return 0;
	}
	
	
}

public class SetExample4 {

	public static void main(String[] args) {
		Set<Books> s=new TreeSet<Books>();
		//HashSet<Books> s=new HashSet<Books>();
		
		Books b1=new Books(110,"C++","Balagurusamy",950);
		Books b2=new Books(101,"Java","Khalid Mughal", 500);
		Books b3=new Books(102, "Networking", "Teninbaum", 300);
		
		
		s.add(b1);
		s.add(b2);
		s.add(b3);
		
		for(Books b:s)
		{
			System.out.println(b.id+" "+b.bookName+" "+b.authorname+" "+b.price);
		}
	}

}
