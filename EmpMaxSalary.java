package MyProgrammes;

import java.util.Scanner;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

class EmpDetail
{
	private String name;
	private int age;
	private int salary;
	Scanner s;
	
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getSalary() {
		return salary;
	}

	public Scanner getS() {
		return s;
	}

	public void setData()
	{
		s=new Scanner(System .in);
		System.out.println("Enter Name :");
		name =s.nextLine();
		
		System.out.println("Enter Age :");
		age=s.nextInt();
		
		System.out.println("Enter Salary :");
		salary =s.nextInt();
		
		s.nextLine();
	}
	
	public EmpDetail getMax(EmpDetail e1,EmpDetail e2)
	{
		if(e1.salary >this.salary && e1.salary >e2.salary )
			return e1;
		else if(e2.salary >this.salary && e2.salary >e1.salary)
			return e2;
		else
			return this;
	}
}

public class EmpMaxSalary {

	public static void main(String[] args) {
		EmpDetail e[]=new EmpDetail[3];
		
		for(int i=0;i<e.length ;i++)
		{
			e[i]=new EmpDetail();
			e[i].setData();
		}
		
		EmpDetail em=e[0].getMax(e[1],e[2]);
		
		System.out.println("Name :"+em.getName()+" Age : "+em.getAge()+" Salary :"+em.getSalary());

	}

}
