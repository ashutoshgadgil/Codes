package MyProgrammes;

public class SplitProgram {

	public static void main(String[] args) {
		String str="Welcome to Java Programming";
		
		String words[];
		words=str.split(" ");   // delimiter space / separater symbol
		
		for(int i=0;i<words.length;i++)
		{
			System.out.println(words[i]);
		}
	}

}
