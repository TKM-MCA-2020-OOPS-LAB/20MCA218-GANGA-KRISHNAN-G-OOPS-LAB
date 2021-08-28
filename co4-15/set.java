package ganga;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;
public class set {
	
	//Implemening set using LinkedHashSet

	
		public static void main(String[] args)
		{
			
			Set<Integer> s = new LinkedHashSet<Integer>(); // set initialization
			
			//Adding elements to set
			System.out.println("Enter the limit and elements to be inserted");
			Scanner inp = new Scanner(System.in);
			int n = inp.nextInt();
			
			while(n!=0)
			{
				
				int e = inp.nextInt();
				s.add(e);
				n--;
			}
			
			//printing set 
			
			System.out.println("Set is "+s);
			
			//Deletion
			System.out.println("\nEnter the element to be deleted:");
			int r = inp.nextInt();
			
			if(s.remove(r))
			{
				System.out.println("New set is :" + s);
			}
			else
			{
				System.out.println("Element is not in set");
			}
			
			//Using iterator
			
			 System.out.println("\nIterating over set:");
		        Iterator<Integer> i = s.iterator();
		        while (i.hasNext())
		            System.out.println(i.next());
			
			
			
			
		}
	}

