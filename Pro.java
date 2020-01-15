package MyProgrammes;

public class Pro {

	private char pass[];
	private String password;
	public void showPass()
	{
		String pw="abcd1234";
		
		pass=new char[pw.length()];
		
		int c[]=new int[pw.length()];
		for(int i=0;i<pw.length();i++)
		{
			c[i]=(int)(pw.charAt(i))+1;
		}
		
		for(int i=0;i<pw.length();i++)
		{
			c[i]=(char)c[i];
			//System.out.print((char)c[i]);
		}
		
		password =c.toString();
	}
	
	public void showPW()
	{
		System.out.println(password );
	}
	public static void main(String[] args) {
		Pro p=new Pro();
		p.showPass();
		p.showPW();
	}

}
