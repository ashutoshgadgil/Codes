package MyProgrammes;

public class C1 {
	
	public static void main(String[] args) {
		int a=10,b=20;
		
		// Unary Operator
		// a++ = >> a = a + 1
		
		//System.out.println(a++);   //10,10, 12,10,11,10,10,10,10
		System.out.println(++b);     // 21 ,20
		//System.out.println(a);     // 10,11,10,1011,,11,
		
		int y = a++ + ++a;
		
		System.out.println(y);     // 23, 24, 22
		
		// Arithmatic Modulo operator  % Used to get Remainder
		
		System.out.println(10%2);
		
		// Shift Operator
		
		System.out.println(5<<2);   // 5 * 2 ^ 2  = 20
		
		System.out.println(5>>2);   // 5 / 2 ^ 2 = 1
		
		int d=4;
		int e=5;
		System.out.println((10>d++)&&(2<d++));  // && Logical And
		
		System.out.println((5<e++)&(2<e++));    // & Bitwise And
		
		
		System.out.println("d : "+d);
		System.out.println("e : "+e);
		
		// Conditional operator or Ternary Operator
		// (Condition) ? Statement1 : Statement2 ;
		int result=(2>4)?10:4;    // ?: is a ternary operator
		
		System.out.println(result );
		
		
		// Assignment Operator
		
		int var=6;
		var+=10;         //  +=  means var = var + 10
		System.out.println(var);
		
		System.out.println(5>2);
		
		
		
		
		
	}
}
