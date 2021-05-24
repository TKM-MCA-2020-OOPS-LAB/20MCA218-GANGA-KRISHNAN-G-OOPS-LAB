package oops;

import java.util.*;

public class Person {
	String name, gender, address;
	int age;
	
	public Person(String m, String n, String o, int p){
		name = m;
		gender = n;
		address = o;
		age = p;
	}
	
	
	static class Employee extends Person{
	     int empId;
	     String companyName, qualification;
	     float salary;
	     
	     public Employee(String m, String n, String o, int p, int q, String r, String s, float t) {
	    	 super(m,n,o,p);
	    	 
	    	 empId = q;
	    	 companyName = r;
	    	 qualification = s;
	    	 salary = t;
	     }
	     
	static class Teacher extends Employee{
	     int teacherId;
	     String subject, department;
	  
	     public Teacher(String m, String n, String o, int p, int q, String r, String s, float t, int u, String v, String w) {
	    	 super(m,n,o,p,q,r,s,t);
		  
	    	 teacherId = u;
	    	 subject = v;
	    	 department = w;
		 }
	  
	  
	      void Display() {
	    	  System.out.println("********DETAILS*********");
	          System.out.println("NAME            :         "+name+"\n");
	          System.out.println("GENDER          :         "+gender+"\n");
	          System.out.println("ADDRESS         :         "+address+"\n");
	          System.out.println("AGE             :         "+age+"\n");
	          System.out.println("EMPLOYEE ID     :         "+empId+"\n");
	          System.out.println("COMPANY NAME    :         "+companyName+"\n");
	          System.out.println("QUALIFICATION   :         "+qualification+"\n");
	          System.out.println("SALARY          :         "+salary+"\n");
	          System.out.println("TEACHER ID      :         "+teacherId+"\n");
	          System.out.println("DEPARTMENT      :         "+department+"\n");
	          System.out.println("SUBJECT         :         "+subject+"\n"); 
			
	    }
 
  }		

  
  
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int count, a,b,c,i;
		float sal;
		String d,f,g,h,x,y,z;
		
		System.out.println("Enter the number of records to be stored:");
        count = sc.nextInt();
        
        Teacher[] t = new Teacher[count];
        
        for( i=0; i<count; i++)
		{
		
		System.out.println("ENTER NAME           :            ");
        d= sc.next();
        
        System.out.println("ENTER GENDER         :            ");
        f= sc.next();
        
        System.out.println("ENTER ADDRESS        :            ");
        g= sc.next();
        
        System.out.println("ENTER AGE            :            ");
        a= sc.nextInt();
        
        System.out.println("ENTER EMPLOYEE ID    :            ");
        b= sc.nextInt();
        
        System.out.println("ENTER COMPANY NAME   :            ");
        h= sc.next();
        
        System.out.println("ENTER QUALIFICATION  :            ");
        x= sc.next();
        
        System.out.println("ENTER SALARY         :            ");
        sal= sc.nextFloat();
        
        System.out.println("ENTER TEACHER ID     :            ");
        c= sc.nextInt();
        
        System.out.println("ENTER DEPARTMENT     :            ");
        y= sc.next();
        
        System.out.println("ENTER SUBJECT        :            ");
       z= sc.next();
        
        
        t[i] = new Teacher(d,f,g,a,b,h,x,sal,c,y,z);
	  }
       
        
		for( i=0; i<count; i++)
	        {
			   t[i].Display();
		    }
		
		
		
   }
	
 }

}
  
