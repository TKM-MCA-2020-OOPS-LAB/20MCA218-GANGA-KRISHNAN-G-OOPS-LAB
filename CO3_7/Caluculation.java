package java_programming;
import java.util.*;
import java.text.*;

interface Caluculation{
	void total();



class Order implements Caluculation{
	int Pdt_id, quantity;
	String Name;
	float price,total;
	
	
	public Order( int pdt_id, String n, int q, float p) {
		
		Pdt_id = pdt_id;
		Name = n;
		quantity = q;
		price = p;
		
		
	}
	
	
	public void total() {
		total = 0 + (quantity * price);
		
		
		
	}
	
	public void Display() {
		
		 System.out.println(Pdt_id+"\t\t\t"+Name+"\t\t\t"+quantity+"\t\t\t"+price+"\t\t\t\t"+total);
		 System.out.println("_________________________________________________________________________________________________________________________________");
	}
	
	
}

//public class Bill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, Pdt_id, quant, rand;
		String P_name;
		float price,net_amt=0;
		double N;
		 N = Math.random() *1000000;
	        rand = (int) N;
	        
	    DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
	    Date d= new Date();
	    System.out.println("\t\t\t________BILL DETAILS________");
		System.out.println("\nEnter the number of products to be added:");
        n = sc.nextInt();
        
        Order  O[] = new Order[n];
        for ( int i = 0; i<n; i++)
          {
        	System.out.println("\nItem No:"+(i+1));
        	
        	System.out.println("Enter the Product ID     : ");
        	Pdt_id = sc.nextInt();
        	
        	System.out.println("Enter the Name           : ");
        	P_name = sc.next();
        	
        	System.out.println("Enter the quantity       : ");
        	quant = sc.nextInt();
        	
        	System.out.println("Enter the unit price     : ");
        	price = sc.nextFloat();
        	
            O[i] = new Order(Pdt_id,P_name,quant,price);
            O[i].total();
            
          }
        
        System.out.println("\n\n\t\t\t\t\t\tINVOICE GENERATED");
        System.out.println("Order no. #"+rand);
        System.out.println("Date: "+df.format(d));
        
        
        System.out.println("\nProduct Id\t\tName\t\tQuantity\t\t\tunit price\t\t\tTotal");
		System.out.println("________________________________________________________________________________________________________________________________");
        
        for ( int i = 0; i<n; i++)
        {
           O[i].Display();
           net_amt += O[i].total;
		
        }
       
        System.out.println("\t\t\t\t\t\t\t\t\t\t\tNet. Amount\t"+ net_amt);
			
		
		
	}

}