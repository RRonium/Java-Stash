import java.util.*;
public class BSearch2
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("No. of value in the array: ");
        int n = sc.nextInt(),i,l=0,u=n,m=0;
        int arr[] =new int[n];
        System.out.println("Enter the values for the array: ");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]+", ");
        }
        System.out.println("Enter the search key: ");
        int s = sc.nextInt();
        while(l<=u)
        {
            m=(l+u)/2;
            if(s<arr[m])
            {
                u=m-1;
            }
            else if(s>arr[m])
            {
                l=m+1;
            }
            else if(s==arr[m])
            {
                System.out.println("At position: "+(m+1));
                break;
            }
            else
            {
                System.out.println("Not there");
            }
        }
    }
}
