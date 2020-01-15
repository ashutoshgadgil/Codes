package MyProgrammes;

class Car
{
	private String brand;
	private int speed;
	
	public void set(String b,int sp)
	{
		brand =b;
		speed =sp;
	}
	
	public void show()
	{
		System.out.println(brand +" "+speed );
	}
	
	public Car getDetails(Car c)    // function returns an object and accepts an object
	{
		return c;
	}
}

public class Pro6 {

	public static void main(String[] args) {
		Car c1=new Car();
		c1.set("Tata", 130);
		c1.show();
		
		Car c2;
		c2=c1.getDetails(c1);    // c2=c1
		
		//c2=c1;
		c2.show();
	}

}
