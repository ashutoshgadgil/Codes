package MyProgrammes;

public class Pro16 {

	private String name,city;
	
	Pro16(String n,String c)
	{
		name=n;
		city=c;
	}
	
	Pro16(Pro16 p)
	{
		this.city =p.city ;
		
	}
	
	public void setName(String n)
	{
		name=n;
	}
	
	public void show()
	{
		System.out.println(name+" "+city);
	}
	public static void main(String[] args) {
		Pro16 o1=new Pro16("abc","Pune");
		Pro16 o2=new Pro16(o1);
		
		o1.show();
		
		o2.setName("def");
		o2.show();

	}

}
