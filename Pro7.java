package MyProgrammes;

// POJO (Plain Old Java Object)
class Customer
{
	private int cid;
	private String cname;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	} 
	
	
}

class Product
{
	private int pid;
	private String pname;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	
}

public class Pro7 {

	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.setCid(101);
		c1.setCname("Ajay");
		
		Product p1=new Product();
		p1.setPid(1234);
		p1.setPname("Mobile");
		
		System.out.println("Customer ID :"+c1.getCid());
		System.out.println("Customer Name :"+c1.getCname());
		System.out.println("Product ID :"+p1.getPid());
		System.out.println("Product Name :"+p1.getPname());
		
		
	}

}
