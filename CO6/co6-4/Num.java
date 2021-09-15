import java.io.*;

 class Num
{
public static void main(String args[]) throws IOException { 
     FileInputStream fr = new FileInputStream("integers.txt");
     FileOutputStream fw1 = new FileOutputStream("evenno.txt");
     FileOutputStream fw2 = new FileOutputStream("oddno.txt");
     System.out.println("*****************************even numbers and odd numbers are copied to separate files****************************"); 
     int i;
     while((i=fr.read()) != -1) 
    	  
     {
      if(i%2==0)
      fw1.write(i);
      else
      fw2.write(i);
     }
     
     fr.close();
     fw1.close();
     fw2.close();
     
 }
}