public class product{
	    int pcode;
	    String pname;
	    double price;
	    double lowest;
	    void data(int c, String n, double p){
	        pcode=c;
	        pname=n;
	        price=p;
	    }
	    void display(){
	        System.out.println(pcode+"\t\t"+pname+"\t\t"+price);
	        
	    }  
	    static void findLowest(double price1,double price2, double price3){
	    if(price1<=price2 && price1<=price3){
	        System.out.println("\nProduct1 is  the lowest price");
	        
	    }
	    else if(price2<=price1 && price2<=price3){
	        System.out.println("\nProduct2 is  the lowest price");
	        
	    }
	    else{
	        System.out.println("\nProduct3 is  the lowest price");
	        
	    }
	    
	   }
	  public static void main(String[] args){
	        product obj1 = new product();
	        product obj2 = new product();
	        product obj3 = new product();
	        obj1.data(111,"Product1",1060.07);
	        obj2.data(222,"Product2",328.40);
	        obj3.data(333,"Product3",4390.60);
	        System.out.println("Product Information:\n Product Code\tProduct Name\tProduct Price");
	        obj1.display();
	        obj2.display();
	        obj3.display();
	        findLowest(obj1.price,obj2.price,obj3.price);    
	        
	    }
	}
