package JAVA;
import java.util.Scanner;
import java.lang.String;

public class CPU {
	double price;
	   public class processor{
		   float ncores;
		   String manufacturer;
		   void pinfo(float a,String processorname) {
		          ncores=a;
		          manufacturer=processorname;
		   System.out.println("The processor information is" +ncores+ "" +manufacturer);
	   }
	   }
	   static class ram{
		   float memory;
		   String manufacturer;
		   void prinfo(float b,String ramname) {
			   memory=b;
			   manufacturer=ramname;
		   
		   System.out.println("The Ram information is" +memory+ "" +manufacturer); 
		   
	   }
	   }

		public static void main(String[] args) {
			CPU obj=new CPU();
			CPU.processor obj1=obj.new processor();
			CPU.ram obj2=new CPU.ram();
			Scanner s=new Scanner(System.in);
			System.out.println("Enter price of CPU");
			obj.price=s.nextInt();
			System.out.println("Enter processor details");
			float a=s.nextFloat();
			Scanner s1=new Scanner(System.in);
			String processorname=s1.nextLine();
			System.out.print("Enter RAM details");
			float b=s.nextFloat();
			String ramname=s1.nextLine();
			s.close();
			s1.close();
			System.out.println("The price of CPU is"+obj.price);
			obj1.pinfo(a, processorname);
			obj2.prinfo(b, ramname);
		}

	}
