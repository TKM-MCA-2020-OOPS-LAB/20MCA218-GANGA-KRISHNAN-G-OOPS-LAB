package ganga;
import java.util.*;
public class Mapinterface {
		public static void main(String args[])
	    {
	       
	        Map<Integer, String> hm1 = new HashMap<>();
	  
	   //Inserting elements..   
	        hm1.put(1, "Ganga");
	        hm1.put(2, "Parvathy");
	        hm1.put(3, "Chaithanya");
	        System.out.println("Initial Map: "+ hm1);
	        
	        hm1.put( (2), "Nandana");
	        hm1.put((4), "Prajitha");
	        //Updating..
	        System.out.println("Updated Map " + hm1);
	  
	        //Removing..
	        hm1.remove(4);
	  
	        // Final Map..
	        System.out.println("After Removing 4th entry, Final Map  is : "+hm1);
	    
	    }
	}
