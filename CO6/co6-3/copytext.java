import java.io.*; 
class copytext{ 
      public static void main(String args[])throws IOException { 
               FileInputStream fr =new FileInputStream("file1.txt"); 
               FileOutputStream fw=new FileOutputStream("file2.txt") ; 
               System.out.println("**************TEXT IS COPIED FROM FILE1 TO FILE2**************"); 
               int g; 
               while((g=fr.read())!=-1) 
               fw.write((char)g); 
               fr.close(); 
               fw.close(); 
          } 
 } 
