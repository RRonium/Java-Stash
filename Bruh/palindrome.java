import java.util.*;
public class palindrome
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string pls: ");
        String str = sc.nextLine().trim();
        char arr[]=str.toCharArray();
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=arr[arr.length-i-1])
            {
                System.out.println("Not a Palindrome");
                System.exit(0);
            }
        }
        System.out.println("Is a Palindrome");
    }
}