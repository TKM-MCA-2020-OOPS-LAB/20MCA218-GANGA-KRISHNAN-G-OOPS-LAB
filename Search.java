import java.util.Scanner;
public class Search
{
    public static void main(String[] args) 
    {
        int flag = 0, i = 0, n, m;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements of the array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.print("Enter the element to be searched:");
        m = s.nextInt();
        for(i = 0; i < n; i++)
        {
            if(a[i] == m)
            {
                flag = 1;
                break;
            }
            else
            {
                flag = 0;
            }
        }
        if(flag == 1)
        {
            System.out.println("The element found at position:"+(i + 1));
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}