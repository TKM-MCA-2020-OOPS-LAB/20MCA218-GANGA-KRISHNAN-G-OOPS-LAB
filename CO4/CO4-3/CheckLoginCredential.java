package myproject;
import java.util.Scanner;

class Username_Exception extends Exception {
 
 public Username_Exception(String val) {
  super(val);
 }
}
 
class Password_Exception extends Exception {
 
 public Password_Exception(String val) {
  super(val);
 }
}
 
public class CheckLoginCredential {
 
 public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
  String username, password;
  
  System.out.print("ENTER USERNAME             :            ");
  username = s.nextLine();
  
  System.out.print("ENTER PASSWORD             :            ");
  password = s.nextLine();
  
  int length = username.length();
  
  try {
   if(length < 6)
    throw new Username_Exception("Username must contain atleast 6 characters  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
   else if(!password.equals("a123#")) 
    throw new Password_Exception("Incorrect password or username !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
   else
    System.out.println("LOGIN SUCCESSFULLY  !!!!!!!!!!!!!!!!!");
  }
  catch (Username_Exception u) {
   u.printStackTrace();
  }
  catch (Password_Exception p) {
   p.printStackTrace();
  }
  finally {
   System.out.println("The finally statement is executed");
  }
 }
}