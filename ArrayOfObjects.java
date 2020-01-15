package MyProgrammes;

import java.util.Scanner;

class Mobile
{
	private String model;
	private String Processor;
	private int price;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getProcessor() {
		return Processor;
	}
	public void setProcessor(String processor) {
		Processor = processor;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showDetails()
	{
		System.out.println("Model : "+getModel()+" Processor : "+getProcessor()+" Price : "+getPrice());
	}
}

public class ArrayOfObjects {

	public static void main(String[] args) {
		Mobile mob[]=new Mobile[3];              // Array of Objects
		
		Scanner s=new Scanner(System .in);
		
		String model,processor;
		int price;
		
		for(int i=0;i<mob.length;i++)
		{
			mob[i]=new Mobile();                // Allocation of memory for objects
			
			
			System.out.println("Enter Model :");
			model=s.nextLine();
			
			System.out.println("Enter Processor :");
			processor =s.nextLine();
		
			System.out.println("Enter Price :");
			price =s.nextInt();
			
			mob[i].setModel(model);
			mob[i].setProcessor(processor);
			mob[i].setPrice(price);
			
			s.nextLine();
			System.out.println();
		}
		
		for(int i=0;i<mob.length;i++)
		{
			mob[i].showDetails();
			System.out.println();
		}
	}

}
