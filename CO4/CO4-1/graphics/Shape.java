package graphics;

import java.util.Scanner;

public interface Shape{
	void rectangle();
	void triangle();
	void square();
	void circle();

public class Area implements Shape {
	int x,y,b,h,r;
	double a,ar,are,c;
	Scanner s=new Scanner(System.in);
	public void rectangle()
	{
		System.out.println("Enter the length of Rectangle: ");
		x=s.nextInt();
		System.out.println("Enter the breadth of Rectangle: ");
		y=s.nextInt();
		a=x*y;
		System.out.println("Area of Rectangle: "+a);
	
	}
	public void triangle()
	{
		System.out.println("Enter the base length of Triangle: ");
		b=s.nextInt();
		System.out.println("Enter the height of Triangle: ");
		h=s.nextInt();
		ar=0.5*b*h;
		System.out.println("Area of Triangle: "+ar);
	}
	public void square()
	{
		System.out.println("Enter the side length of Square: ");
		a=s.nextInt();
		are=a*a;
		System.out.println("Area of Square: "+are);
	}
	public void circle()
	{
		System.out.println("Enter the radius of Circle: ");
		r=s.nextInt();
		c=Math.PI*r*r;
		System.out.println("Area of Circle: "+c);

	}
}
}