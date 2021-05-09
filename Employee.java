import java.util.*;

public class Employee{
	
	    int[] no = new int[20];
	    int count,i,e;
	    String[] name = new String[50];
	    float[] salary = new float[20];
	    
	    
	    void getinformation(int c){
	        Scanner s = new Scanner(System.in);
	        count=c;
	          for(i=0;i<c;i++){
	              System.out.println("Enter Employee Number : ");
	              no[i]=s.nextInt();
	              System.out.println("Enter Employee Name   : ");
	              name[i]=s.next();
	              System.out.println("Enter Employee Salary : ");
	              salary[i]=s.nextFloat();   
	        } 
	    }
	    
	    void printinformation(int c){
	        count =c;
	        System.out.println("***********Employee Details************");
	        for(i=0;i<count;i++)
	        {
	           System.out.println(" Enployee Number:"+no[i]);
	           System.out.println("Employee Name:"+name[i]);
	           System.out.println("Employee Salary:"+salary[i]);    
	        }       
	    }
	    
	    void display(int emp_no, int c) {
	    	int flag=0;
	    	e = emp_no;
	    	count = c;
	    	for(i=0;i<count;i++)
	    	{
	    		if(no[i]==e)
	    		{   
	    	    	System.out.println("Employee No    : "+no[i]);
	    	        System.out.println("Employee Name  : "+name[i]);
	    	        System.out.println("Employee Salary: "+salary[i]);
	    	        flag++;
	    		}
	    				
	    	} 
	    	if(flag==0)
	    		System.out.println("Record Not Found!");
	   }
	               
	    public static void main(String[] args){
	        Employee obj = new Employee();
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number of records to be stored:");
	        obj.count = sc.nextInt();
	        obj.getinformation(obj.count);
	        obj.printinformation(obj.count);
	        System.out.println("\n_Do you want to search any specific record?");
	        System.out.println("Enter Employee Number :");
	        int e = sc.nextInt();
	        obj.display(e,obj.count);
	        sc.close();     
	    }   
	}