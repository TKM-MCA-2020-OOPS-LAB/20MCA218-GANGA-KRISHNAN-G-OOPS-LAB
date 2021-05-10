import java.util.Scanner;
public class shapes {
    static final double PI = Math.PI;
    void area(int a)
    {
        int area1=a*a;
        System.out.println("Area of square is "+area1);
       
    }
    void area(int m,int n)
    {
        int area2=m*n;
        System.out.println("Area of rectangle is "+area2);
        
    }
    void area(double r)
    {
        double area3=PI*r*r;
        System.out.println("Area of circle is "+area3);
        
    }
    void area(double b,double h)
    {
        double area4=(b*h)/2;
        System.out.println("Area of triangle is "+area4);
        
    }
public static void main(String[] args)
{
    shapes g=new shapes();
    Scanner s=new Scanner(System.in);
    System.out.println("\n");
    System.out.println("*********SQUARE*********");
    System.out.println("Enter value of a : ");
    int p=s.nextInt();
    g.area(p);
    System.out.println("\n");
    System.out.println("*********RECTANGLE*********");
    System.out.println("Enter values of m and n : ");
    int q=s.nextInt();
    int t=s.nextInt();
    g.area(q,t);
    System.out.println("\n");
    System.out.println("**********CIRCLE**********");
    System.out.println("Enter value of r : ");
    double z=s.nextDouble();
    g.area(z);
    System.out.println("\n");
    System.out.println("***********TRIANGLE**********");
    System.out.println("Enter the width of the Triangle:");
    double b= s.nextDouble();
    System.out.println("Enter the height of the Triangle:");
    double h= s.nextDouble();
    g.area(b,h);

}
}
