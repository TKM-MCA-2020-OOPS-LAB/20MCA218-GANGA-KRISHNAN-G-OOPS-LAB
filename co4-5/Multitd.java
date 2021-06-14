package javaproject;

import java.util.Scanner;

class Multiplication extends Thread{
			
		public void run() {
			System.out.println("............THREAD 1........................");
			System.out.println("\n...........Multiplication Table of 5..........\n");
			int number =5;
			for(int i=1;i<=10;i++) {
				System.out.printf("%d * %d = %d \n" , i, number , number *i);
			}
		}
	
}
class Primeno extends Thread{
	
	public void run() {
		System.out.println("\n...................THREAD 2.....................\n");
		System.out.println("\n..............FIRST N PRIME NUMBERS..............\n");
		int n;
	      int status = 1;
	      int num = 3;
	    
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the value of n:");
	      
	      n = sc.nextInt();
	      if (n >= 1)
	      {
	         System.out.println("The First "+n+" prime numbers are:");
	      
	         System.out.println(2);
	      }

	      for ( int i = 2 ; i <=n ;  )
	      {
	         for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
	         {
	            if ( num%j == 0 )
	            {
	               status = 0;
	               break;
	            }
	         }
	         if ( status != 0 )
	         {
	            System.out.println(num);
	            i++;
	         }
	         status = 1;
	         num++;
		}sc.close();
	}
	
}


public class Multitd {

	public static void main(String[] args)throws InterruptedException {
		
		Multiplication m = new Multiplication();
		
		m.start();
		m.sleep(200);
		Primeno p = new Primeno();
		p.start();
		p.sleep(200);
	
		// TODO Auto-generated method stub

	}

}