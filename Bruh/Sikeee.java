import java.util.*;
public class Sikeee
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter String pls: ");
        String str=sc.next();
        char tmp;
        /*char arr[] =new char[str.length()];
        arr=str.toCharArray();
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    tmp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=tmp;
                }
            }
        }      */
        
        int f[] =new int[str.length()];
        char arr[]=str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            f[i]=1;
            for(int j=0;j<str.length()-i-1;j++)
            {
                if(arr[i]==arr[j])
                {
                    f[i]++;
                    arr[j]='0';
                }
            }
        }
        
    }
}