package MyProgrammes;
//import java.lang.String; 

public class String1 {

	public static void main(String[] args) {
		String str1="Hello";       // String Literals
		
		String str2="Hello";
		
		String str3="abc";
		
		int lengthOfString=str1.length();
		
		System.out.println("String Length : "+lengthOfString );
	
		System.out.println("Upper Case : "+str1.toUpperCase());
		System.out.println("Lower case : "+str1.toLowerCase());
		System.out.println("Character at index 1 : "+str1.charAt(1));
		
		System.out.println("Concatenated String : "+str1.concat(str3));
		System.out.println("Index of character is :"+str1.indexOf("e"));
		System.out.println("Index of string : "+str1.indexOf("llo"));
		System.out.println("Contains String : "+str1.contains("He"));
		System.out.println("Substring : "+str1.substring(3, 5));
		System.out.println(str1.startsWith("H"));
		System.out.println(str1.endsWith("o"));
		System.out.println(str1.replace("o", "l"));
		
		if(str1.equals(str2))               // equals method checks the two values are equal
			System.out.println("Str1=Str2");
		else
			System.out.println("str1!=Str2");
		
		if(str1==str2)                     // == checks the references of two strings
			System.out.println("str1=str2");
		else
			System.out.println("str1!=str2");
		
		if(str1==str3)                     // == checks the references of two strings
			System.out.println("str1=str3");
		else
			System.out.println("str1!=str3");
		
		if(str1.isEmpty())
			System.out.println("String is Empty");
		else
			System.out.println("String not empty");
		
		str3="";
		if(str3.isEmpty())
			System.out.println("String is empty");
		
		String str4=" Hello"+" "+"World ";    // + is a concatenation operator
		
		System.out.println(str4);
		
		System.out.println(str4.trim());     // Removes the leading and trailing spaces from string
		
		String str5="Hi";
		String str6="Java";
		
		str5=str5.concat(str6);
		
		System.out.println(str5);
		
		
		System.out.println(str1.lastIndexOf("l"));
		
		
	}

}
