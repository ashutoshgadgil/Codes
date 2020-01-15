package MyProgrammes;

class Games
{
	protected String type;
	protected String rules;
	protected int TotalGames;
	
	public Games()
	{
		type ="Indoor";
		//System.out.println("Type of Game : "+type );
	}
	
	public Games(String rules)
	{
		TotalGames =10;
		this.rules =rules ;
	}
	
	public void message()
	{
		System.out.println("-----------Game Rules--------------");
	}
}

class Cricket extends Games
{
	protected int noOfplayers;
	protected String name;
	protected int TotalGames;
	
	public Cricket()
	{
		//super();
		super("1. Minimum 11 Players in a Team\n2. Maximum one bounce allowed");  // calling superclass 
		                                                                    //Parameterised constructor
		TotalGames =15;
		noOfplayers =11;
		type ="Outdoor";
		name ="Cricket";
		System.out.println("Game\t\t: "+name +"\nGame Type\t: "+type +"\nNo of Players\t: "+noOfplayers );
		System.out.println();
	}
	
	public void showRules()
	{
		super.message();           // Calling superclass method
		System.out.print(rules);
		System.out.println(super.TotalGames);
	}
}


class Tennis extends Games
{
	protected int noOfplayers;
	protected String name;
	
	public Tennis()
	{
		super();
	}
	
	public Tennis(String rules)
	{
		super(rules);
		noOfplayers =2;
		name ="Lawn Tennis";
	}
	
	public void showDetails()
	{
		System.out.println("Game : "+name +"\nNo of Players :"+noOfplayers );
		super.message();
		System.out.println(rules );
	}
	
	public String getType()
	{
		return type ;
	}
}

public class Inherit2 {

	public static void main(String[] args) {
		Cricket c=new Cricket();
		c.showRules();
		
		System.out.println("******************************************");
		Tennis t1=new Tennis();
		Tennis t=new Tennis("Rules of Tennis");
		System.out.println("\nGame type : "+t1.getType());
		t.showDetails();
		
	}

}
