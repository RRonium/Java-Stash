import java.util.*;
public class Black
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        int arr[] =new int[10];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int l=0,u=arr.length,m=0,sk;
        System.out.println("Enter search key please: ");
        sk=sc.nextInt();
        while(l<=u)
        {
            m=(l+u)/2;
            if(sk>arr[m])
            {
                l=m;
            }
            else if(sk<arr[m])
            {
                u=m;
            }
            else if(sk==m)
            {
                System.out.println("Found! at position"+(m+1));
                break;
            }
            else
            {
                System.out.println("Not found");
            }
        }
    }
}