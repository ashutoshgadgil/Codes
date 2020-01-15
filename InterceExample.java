package MyProgrammes;

interface inter1
{
	public void f();
}

class cl3 implements inter1
{

	@Override
	public void f() {
		System.out.println("Method implemented");
		
	}
	
	public void f1()
	{
		
	}
	
	public void show(inter1 i)        // inter1 i= new cl3();
	{
		i.f();
		
	}
	
}

public class InterceExample {

	public static void main(String[] args) {
		cl3 obj=new cl3();
		
		obj.show(obj);
	}

}
