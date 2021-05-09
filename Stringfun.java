public class Stringfun {
    public static void main(String[] args) {
    String s1 = "Java";
    String s2 = "Programming";
    System.out.println("string 1 : "+s1);
    System.out.println("string 2 : "+s2);
    String s3 = s1+" "+s2;
    System.out.println("string 3 : "+s3);
    System.out.println("\nThe length of the string3 is : "+ s3.length());
    String s4 = s1.toUpperCase();
    System.out.println("\nString1 to uppercase :"+s4);
    String s5 = s2.toLowerCase();
    System.out.println("\nString2 to Lowercase :"+s5);
    int i = s4.compareTo(s5);
    if(i==0){
    System.out.println("\nBoth strings are equal");
    }else{
    System.out.print("\nThe Strings are not equal.");
    String str1 = "Object Oriented Programming";
    System.out.println("\nActual String: "+str1);
    System.out.print("Reverse of the above string is : ");
    for(int j = str1.length()-1; j>=0; j--){
    System.out.print(str1.charAt(j));
    }
    String s6 = "Programming Lab";
    System.out.println("\nNext String: "+s6);
    System.out.println("\nCharacter at position 5: " + s6.charAt(5));
    }
    }
}