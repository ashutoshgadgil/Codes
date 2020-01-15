package MyProgrammes;

class vehicle
{
	public int getSpeed()
	{
		return 0;
	}
}

class Bike extends vehicle 
{
	public int getSpeed()
	{
		return 180;
	}
}

class Scooty extends vehicle
{
	public int getSpeed()
	{
		return 150;
	}
}

public class OverridingExample2 {

	public static void main(String[] args) {
		Bike b=new Bike();
		Scooty s=new Scooty();
		
		System.out.println("Max Speed of Bike :"+b.getSpeed());
		System.out.println("Max Speed of Scooty :"+s.getSpeed());
	}

}
