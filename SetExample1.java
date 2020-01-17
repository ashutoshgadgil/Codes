package MyProgrammes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class SetClass
{
	Set <Integer> s;
	TreeSet<Integer> t;
	
	public SetClass()
	{
		s=new HashSet<Integer>();
	}
	
	public Set getObject()
	{
		return s;
	}
	
	public SetClass(Set s)
	{
		t=new TreeSet<Integer>(getObject());
	}
	
	public void addItems(int roll)
	{
		s.add(roll);
	}
	
	public void showItems()
	{
		System.out.println(s);
	}
}

public class SetExample1 {

	public static void main(String[] args) {
		SetClass s=new SetClass();
		
		s.addItems(112);
		s.addItems(101);
		s.addItems(102);
		s.addItems(103);
		s.addItems(104);
		s.addItems(105);
		s.addItems(108);
		s.addItems(106);
		s.addItems(110);
		s.addItems(107);
		
		s.showItems();

		SetClass s1=new SetClass(new HashSet<Integer>());
		
		s1.showItems();
		
		
	}

}
