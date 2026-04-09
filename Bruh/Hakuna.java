import java.util.*;
public class Hakuna
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter pls: ");
        int n = sc.nextInt(),tmp=0;
        int arr[] =new int[n];
        
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Unsorted: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+", ");
        }
        System.out.println();
        System.out.println("Sorted:  ");
        
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+", ");
        }
        int m=0,l=0,u=arr.length-1;
        System.out.println("Enter search key: ");
        int sk=sc.nextInt();
        while(l<=u)
        {
            m=(l+u)/2;
            if(sk>arr[m])
            {
                l=m+1;
            }
            else if(sk<arr[m])
            {
                u=m-1;
            }
            else if(sk==arr[m])
            {
                System.out.println("Found it, Position: "+(m+1));
            }
            else
            {
                System.out.println("Not there");
            }
        }
    }
}