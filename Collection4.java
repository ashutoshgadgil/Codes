package MyProgrammes;

import java.util.ArrayList;

class listExample
{
	ArrayList l1;
	ArrayList l2;
	
	public listExample()
	{
		l1=new ArrayList();
		l2=new ArrayList();
	}
	
	public void addItems()
	{
		l1.add(1);
		l1.add(2);
		l1.add(3);
	}
	
	public void showList1()
	{
		System.out.println("Original List is :");
		for(Object i:l1)
		{
			System.out.print(i.toString()+" ");
		}
	}
	
	public void showList2()
	{
		System.out.println("Copied List is :");
		for(Object i:l2)
		{
			System.out.print(i.toString()+" ");
		}
	}
	
	public void copyList()
	{
		for(Object i:l1)
		{
			l2.add((Integer .parseInt(i.toString())*Integer .parseInt(i.toString())));
		}
	}
}

public class Collection4 {

	public static void main(String[] args) {
		listExample l1=new listExample();
		l1.addItems();
		l1.showList1();
		System.out.println();
		l1.copyList();
		l1.showList2();
	}

}
