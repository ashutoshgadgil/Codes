package MyProgrammes;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		/*int x=5,y=0,z;

		try {
			z=x/y;    // Exception is raised
			System.out.println(z);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		*/
		
		/*
		String str="10";
		
		int x=5;
		int z=x+Integer .parseInt(str);
		
		System.out.println(z);
		
		try {
			System.out.println(Integer .parseInt("a"));

		} catch (NumberFormatException  e) {
			System.out.println("Can not conver from string a to integer "+e.getMessage());
		}
			*/
		
		int num[]=new int[3];
		
		try {
			num[4]=10;
			System.out.println(num[4]);
		} catch (ArrayIndexOutOfBoundsException  e) {
			System.out.println("Array can not store index more than 2");
			
		}
		
		System.out.println(num[1]);
		
	
	}

}
