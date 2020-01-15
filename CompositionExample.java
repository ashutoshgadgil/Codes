package MyProgrammes;

import java.util.Scanner;

class Empl
{
	private int empid;
	private String empname;
	private Address ob;
	Scanner s;
	
	private int age;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	public Empl()
	{
		ob=new Address();
	}
	
	public void setDetails()
	{
		s=new Scanner(System .in );
		System.out.println("Enter Eid :");
		setEmpid(s.nextInt());
		s.nextLine();
		System.out.println("Enter Name :");
		setEmpname(s.nextLine());
		System.out.println("Enter Flat No  :");
		ob.setLaneNo(s.nextLine());
		System.out.println("Enter City :");
		ob.setCity(s.nextLine());
		System.out.println("Enter State :");
		ob.setState(s.nextLine());
		System.out.println("Enter Country :");
		ob.setCountry(s.nextLine());
		s.nextLine();
	}
	
	public void setAge()
	{
		s=new Scanner(System .in );
		System.out.println("Enter age :");
		age=s.nextInt();
	}
	
	public int getAge()
	{
		return age;
	}
	
	public Empl compAge(Empl ag)
	{
		if(this.age >ag.age)
			return this;
		else
			return ag;
	}
	
	public void getDetails()
	{
		System.out.println("Employee ID : "+getEmpid()+"\nEmployee Name : "+getEmpname()+"\nEmployee Address :"+ob.getLaneNo()+" "+ob.getCity()+" "+ob.getState()+" "+ob.getCountry() );
	}
	
}

class Address
{
	private String laneNo;
	private String city;
	private String state;
	private String country;
	public String getLaneNo() {
		return laneNo;
	}
	public void setLaneNo(String laneNo) {
		this.laneNo = laneNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	
}
public class CompositionExample {

	public static void main(String[] args) {

		//Empl e=new Empl();
		//e.setDetails();
		//e.getDetails();
		/*
		Empl e[]=new Empl[3];
		
		for(int i=0;i<e.length;i++)
		{
			e[i]=new Empl();
			e[i].setDetails();
		}
		
		for(int i=0;i<e.length;i++)
		{
			e[i].getDetails();
		}
		
		*/
		
		Empl e1=new Empl();
		Empl e2=new Empl();
		
		e1.setAge();
		e2.setAge();
		
		Empl em=e1.compAge(e2);
		
		System.out.println("Employee Detail :"+em.getAge());
	}

}
