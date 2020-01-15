package MyProgrammes;

import java.util.Scanner;

interface book
{
	public void getBookDetails();
	public void showBookDetails();
}

public class Interface1 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System .in);
		
		book o=new book() {
		
			private String bookName;
			private String author;
			
			@Override
			public void showBookDetails() {
				
				System.out.println(bookName +" "+author );
			}
			
			@Override
			public void getBookDetails() {
				System.out.println("Enter Book Name :");
				bookName =s.nextLine();
				
				System.out.println("Enter Author Name :");
				author =s.nextLine();
			}
		};

		o.getBookDetails();
		o.showBookDetails();
	}

}
