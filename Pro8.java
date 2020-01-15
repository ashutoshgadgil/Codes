package MyProgrammes;

class Rec
{
	private int length;
	private int breadth;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public void area()
	{
		System.out.println(getLength()*getBreadth());
	}
}

public class Pro8 {

	public static void main(String[] args) {
		Rec r=new Rec();
		r.setBreadth(20);
		r.setLength(30);
		r.area();
	}

}
