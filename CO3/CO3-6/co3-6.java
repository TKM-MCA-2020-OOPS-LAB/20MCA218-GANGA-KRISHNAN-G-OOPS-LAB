package java_programming;
import java.util.Scanner;
public interface Shapes {

	void getdata();
	void area();
	void perimeter();

class Circle implements Shapes{
int r;
double pi=3.14,q,p;
public void getdata() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the radius of circle");
	r=sc.nextInt();
	
}
public void area() {
	q=pi*r*r;
	System.out.println("Area of the circle is         :  "+q);
	
}
public void perimeter() {
	p=2*pi*r;
	System.out.println("Perimeter of the circle is    :  "+p);
}	
}
class Rectangle implements Shapes{
int l,b,p,q;
public void getdata() {
Scanner sc1=new Scanner(System.in);
System.out.println("Enter the length of rectangle");
l=sc1.nextInt();
System.out.println("Enter the breadth of rectangle");
b=sc1.nextInt();
}
public void area() {
	q=l*b;
	System.out.println("Area of the rectangle is      :  "+q);
}
public void perimeter() {
	p=2*(l+b);
	System.out.println("Perimeter of the rectangle is :  "+p);
	
}
}

		
	public static void main(String[] args) {
		int ch=0;
		Circle obj=new Circle();
		Rectangle obj1=new Rectangle();
		
		while(ch<=3) {
		Scanner sc2=new Scanner(System.in);
		System.out.println("CHOICES         : \n    1.Circle       \n    2.Rectangle    \n    3.Exit");
		System.out.println("Enter your choice  :  ");
		ch=sc2.nextInt();
		switch(ch) {
		case 1:
			obj.getdata();
			obj.area();
			obj.perimeter();
			break;
		case 2:
			obj1.getdata();
			obj1.area();
			obj1.perimeter();
			break;
		case 3:
			System.out.println("exit");
			break;
		 default:
			 System.out.println("Wrong choice");
		}
	 }
	
   }
	}