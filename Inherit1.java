package MyProgrammes;

class Cars                // Base Class
{
	protected String brand;
	protected String color;
	protected String price;
	protected int speed;
	
	public Cars()
	{
		brand ="BrandName";
		color ="White";
		price ="250000";
		speed =180;
	}
}

class BMW extends Cars    // BMW Child class of Base Class Car
{
	private String engine;
	private String mileage;
	private String gears;
	
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getMileage() {
		return mileage;
	}
	public void setMileage(String mileage) {
		this.mileage = mileage;
	}
	public String getGears() {
		return gears;
	}
	public void setGears(String gears) {
		this.gears = gears;
	}
	
	
}

class Mercedes extends Cars
{
	private String engine;
	private String mileage;
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getMileage() {
		return mileage;
	}
	public void setMileage(String mileage) {
		this.mileage = mileage;
	}
	
	
}

public class Inherit1 {

	public static void main(String[] args) {
	
		BMW b=new BMW();
		b.brand ="BMW";
		b.color ="Black";
		b.speed =250;
		b.price ="2500000";
		b.setEngine("2500 cc");
		b.setGears("Manual");
		b.setMileage("18 kmpl");
		
		System.out.print("Brand : "+b.brand +"\nColor :"+b.color +"\nSpeed :"+b.speed +" \nPrice :"+b.price );
		System.out.println("\nEngine :"+b.getEngine()+ "\nGears :"+b.getGears()+"\nMileage :"+b.getMileage());
	
		Mercedes m=new Mercedes();
		m.brand ="Mercedes";
		m.color ="Red";
		m.speed =150;
		m.price ="1500000";
		m.setEngine("2000 cc");
		m.setMileage("15 kmpl");
		System.out.println();
		System.out.println("Details of "+m.brand);
		System.out.print("Brand : "+m.brand +"\nColor :"+m.color +"\nSpeed :"+m.speed +" \nPrice :"+m.price );
		System.out.println("\nEngine :"+m.getEngine()+"\nMileage :"+m.getMileage());
	
	}

}
