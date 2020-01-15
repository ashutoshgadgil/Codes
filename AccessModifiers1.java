package MyProgrammes;

public class AccessModifiers1 {

	
	public static void main(String[] args) {
		Welcome w=new Welcome();
		
		w.showData();
		
		System.out.println(w.message2 );
		System.out.println(w.message3 );
		
		//System.out.println(w.message1);  // Direct access of members 
	}

}


