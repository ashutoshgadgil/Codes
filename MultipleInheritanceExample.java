package MyProgrammes;

// Achieve multiple inheritance in Java using Interface

interface Color
{
	public String getColor();
}

class lightSource
{
	protected String typeOfSource;
	public String  getType()
	{
		typeOfSource ="Bulb";
		return typeOfSource;
	}
}

class light extends lightSource implements Color
{

	@Override
	public String getColor() {
		return "Red";
	}
	
}

public class MultipleInheritanceExample {

	public static void main(String[] args) {
		light l=new light();
		System.out.println("Light Type  :"+l.getType());
		System.out.println("Light Color :"+l.getColor());
	}

}
