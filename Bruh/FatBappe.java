import java.util.*;
public class FatBappe
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        char ch[] =new char[5];
        System.out.println("Enter the values: ");
        for(int i=0;i<ch.length;i++)
        {
            ch[i]=sc.next().charAt(0);
        }
        String str =new String(ch);
        System.out.println(str);
        
        char arr[]= str.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+", ");
        }
    }
}