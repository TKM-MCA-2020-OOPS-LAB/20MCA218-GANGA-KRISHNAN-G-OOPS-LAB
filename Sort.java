import java.util.Arrays;
import java.util.Scanner;
public class Sort {
   public static void main(String args[]) {
      Scanner srt = new Scanner(System.in);
      System.out.println("Enter the string to be sorted: ");
      String str = srt.nextLine();
      char charArray[] = str.toCharArray();
      Arrays.sort(charArray);
      System.out.println("After Sorting,the string is:");
      System.out.println(new String(charArray));
   }
}