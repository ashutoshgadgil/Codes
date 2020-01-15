package MyProgrammes;

public class ArrayinMethod {

	public void showArray(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	public void getArray(int arr[])
	{
		for(int i=0;i<arr.length ;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public int[] getNumbers()                   // Method returning Array
	{
		int num[]= {100,200,300,400,500};
		return num;
	}
	
	public static void main(String[] args) {
		ArrayinMethod o=new ArrayinMethod();
		
		int num[]= {1,2,3,4,5};
		o.showArray(num);                        // Passing named array to Method
		
		System.out.println();
		o.getArray(new int[] {10,20,30,40,50});  // Passing Anonymous Array to Method
	
		int n[]=o.getNumbers();               
		
		System.out.println();
		for(int i=0;i<n.length ;i++)
		{
			System.out.print(n[i]+" ");
		}
	}

}
