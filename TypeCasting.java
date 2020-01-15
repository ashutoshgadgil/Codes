package MyProgrammes;

public class TypeCasting {

	public static void main(String[] args) {
		
		// Implicit Type Casting (Widening)
		// Smaller Size Data --- > Larger size data
		
		byte b=10;
		int i=b;    // Implicit type casting
		
		// Explicit Type casting  (Narrowing)
		// Larger Size Data  --- > Smaller Size data
		
		int j=10;
		//byte c=j;
		
		byte c=(byte)j;   // Explicit Type Cast from 
		
		System.out.println(c);
		
		float f=1.2f;      // 4 bytes
		double d=1.234567892345d;   // 8 bytes
		
		f=(float)d;

		System.out.println(f);

	
		int var=5;
		
		f=var;
		
		System.out.println(f);
		
		var=(int)d;   // Explicit type casting from double
		              // to int 
		System.out.println(var);
		
		int k;
		long l=12345678912345L;
		
		k=(int)l;
		
		System.out.println(k);
		
		int expr=2+2;
		
		System.out.println(expr);
		
		int result=(2+3)*4;
		
		System.out.println(result );
		
		int x=3,y=2;
		
	    result =(x*x)+2*x*y+(y*y);
	    
	    System.out.println(result );
	    
	    
		
	}

}
