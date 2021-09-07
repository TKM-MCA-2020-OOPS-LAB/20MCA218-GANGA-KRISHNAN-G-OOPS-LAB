package Arithmetic;
import java.util.Scanner;
public interface Calculations {
	void input();
	void addition();
	void subtraction();
	void multiplication();
	void divison();
	}
class Operations implements Calculations {
    double add,sub,mul,div,a,b;
    Scanner s= new Scanner(System.in);
    
	public void input() {
        System.out.println("Enter the 1st number:");
        a=s.nextInt();
        System.out.println("Enter the 2nd number:");
        b=s.nextInt();
        
	
    }

    
	public void addition() {
		add=a+b;
		System.out.println("SUM OF 2 NUMBERS          :   "+add);
	}

	
	public void subtraction() {
		sub=a-b;
		System.out.println("DIFFERENCE OF 2 NUMBERS   :   "+sub);
	}

	
	public void multiplication() {
		mul=a*b;
		System.out.println("PRODUCT OF 2 NUMBERS      :   "+mul);
	}

	
	public void divison() {
		div=(a/b);
		System.out.println("QUOTIENT OF 2 NUMBERS     :   "+div);
	}

}