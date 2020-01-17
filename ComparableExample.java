package MyProgrammes;

import java.util.ArrayList;
import java.util.Collections;

class Employees implements Comparable<Employees>
{
	protected int eid;
	protected String name;
	protected int salary;
	public Employees(int eid, String name, int salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public int compareTo(Employees o) {
		
		if(eid>o.eid)
			return 1;
		else if(eid<o.eid)
			return -1;
		else
			return 0;
	}
	
	
}

public class ComparableExample {

	public static void main(String[] args) {
		ArrayList<Employees> al=new ArrayList<Employees>();
		
		Employees e1=new Employees(102,"Rohit",20000);
		Employees e2=new Employees(101,"Rahul",30000);
		Employees e3=new Employees(103,"Amit",40000);
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		Collections.sort(al);
		
		for(Employees e:al)
		{
			System.out.println(e.eid+" "+e.name+" "+e.salary);
		}
	}

}
