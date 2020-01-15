package MyProgrammes;

public class StringBufferExample {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="Java";
		
		s1.concat(s2);
		System.out.println(s1);                 // prints Hello
	
		
		StringBuffer sb=new StringBuffer("Hello");
		
		System.out.println(sb);
		
		sb.append("Java");
		
		System.out.println(sb);                 // Prints HelloJava
		
		sb.reverse();
		System.out.println(sb);
		
		sb.deleteCharAt(1);
		System.out.println(sb);
		
		sb.insert(1, "Welcome");
		System.out.println(sb);
		
	    String s3=sb.toString();      // toString method converts the StringBuffer to String Object
		
		
	    
	    StringBuilder sbb=new StringBuilder("World");
	    
	    String str="Java";
	    
	    if(str.equalsIgnoreCase("java"))
	    	System.out.println("Equal");
	    else
	    	System.out.println("Not Equal");
		
	}

}
