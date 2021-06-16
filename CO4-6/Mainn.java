package javaproject;

import java.util.Scanner;

class Fibonacci implements Runnable{
	public void run(){
		int a=0,b=1,c=0,l=40;
		System.out.println("******************FIBONACCI SERIES UPTO "+l+"********************");
		while (l>0)
        {
             System.out.print(c+"   ");
             a=b;
             b=c;
             c=a+b;
             l=l-1;
             if(l%10==0)
             {
            	 System.out.println("\n");
             }
        }
		System.out.println("\n\n************************************************************************************************\n");
		System.out.println("\n************************************************************************************************\n");
		}
}

class EvenNumber implements Runnable{
	public void run(){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit : ");
		n=sc.nextInt();
		System.out.println("*************************Even Numbers from 1 to "+n+"**********************");
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i);
				}
			}
		}
}
public class Mainn {

	public static void main(String[] args) {
		Fibonacci obj1=new Fibonacci();
		Thread t1=new Thread(obj1);
		t1.start();
		
		EvenNumber obj2=new EvenNumber();
		Thread t2=new Thread(obj2);
		t2.start();
	}

}