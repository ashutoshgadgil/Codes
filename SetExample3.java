package MyProgrammes;

import java.util.HashSet;

class Authors
{
	protected int id;
	protected String name;
	protected String Title;
	protected int price;
	
	public Authors(int id,String name,String Title,int price)
	{
		this.id=id;
		this.name =name;
		this.Title =Title ;
		this.price =price ;
	}
	
}

public class SetExample3 {

	public static void main(String[] args) {
		HashSet<Authors> hs=new HashSet<Authors>();
		
		Authors a1=new Authors(101,"Teninbaum", "Networking",500);
		Authors a2=new Authors(102,"Balagurusamy", "C++",300);
		Authors a3=new Authors(103,"Frowzen", "Networking",250);
		
		hs.add(a1);
		hs.add(a2);
		hs.add(a3);
		
		for(Authors ob:hs)
		{
			System.out.print("Author Id : "+ob.id+" Author Name : "+ob.name);
			System.out.println(" Subject : "+ob.Title+" Book Price : "+ob.price);
		}

		
	}

}
