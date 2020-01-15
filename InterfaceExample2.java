package MyProgrammes;

import Core.EvenCheck;

interface number
{
	public int num=103;
}

interface EvenNo extends number
{
	public void checkNum();
}

public class InterfaceExample2 implements EvenNo {

	public static void main(String[] args) {
		InterfaceExample2 i=new InterfaceExample2();
		i.checkNum();
	}

	@Override
	public void checkNum() {
		if(EvenNo .num %2==0)
			System.out.println("Number is Even");
		else
			System.out.println("Number is Odd");
		
	}

}
