package MyProgrammes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;

public class MapExample1 {

	public static void main(String[] args) {
		HashMap<String ,Integer > hm=new HashMap<String, Integer >();
		
		hm.put("Pune",5000000);
		hm.put("Mumbai", 100000000);
		hm.put("Delhi",3000000);
		
		System.out.println(hm);
		
		System.out.println();
		System.out.println("Population : "+hm.get("Pune"));
		System.out.println("Population : "+hm.get("Mumbai"));
		System.out.println("Population : "+hm.get("Delhi"));
		
		System.out.println();
		
		   for(Entry<String, Integer> m  :  hm.entrySet()){    
	           System.out.println(m.getKey()+" "+m.getValue());    
	          }  
		   
		  System.out.println("Contains key ? "+hm.containsKey("Pune"));
		   
		  System.out.println("Contains value : "+hm.containsValue(500)); 
		  
		  System.out.println(hm.size());
		  
		  System.out.println(hm.isEmpty());
		  
		  
		  //**********************************************
		  System.out.println("\nList of Keys :");
		  for(String i:hm.keySet())   // KeySet() returns the keys
		  {
			  System.out.println(i);
		  }
		  
		  //**********************************************
		  System.out.println("\nList of values :");
		  for(Integer i:hm.values())
		  {
			  System.out.println(i);
		  }
		  
		  
		  //***********************************************
		  Collection c=hm.values();
		  System.out.println(c);
		  
		  Object ob[]=c.toArray();
		  System.out.println(ob[0]);
		  
		  for(int i=0;i<ob.length;i++)
		  {
			  System.out.println(ob[i]);
		  }
		  //***********************************************
		  
		  System.out.println(hm.values());
		  
	      //***********************************************
		  
		  System.out.println(hm.keySet());
		  
		  //***********************************************
		  
		  
		  
		  
	}

}
