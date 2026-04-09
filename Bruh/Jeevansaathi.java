import java.util.*;
public class Jeevansaathi
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a String pls: ");
        String str = sc.nextLine().trim();
        char arr[] = str.toCharArray();
        char rev[] =new char[arr.length];
        char tmp;
        for(int i=0;i<arr.length;i++)
        {
            rev[i]=arr[arr.length-i-1];
        }
        String s =new String(rev);
        System.out.println(s);
    }
}