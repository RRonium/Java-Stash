import java.util.*;
public class BSearch
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int arr[] = {3,7,14,17,24,35,45};
        int n =sc.nextInt();
        int l=0,u=arr.length,m,i,flag;
        while(l<=u)
        {
            m=(l+u)/2;
            if(n<arr[m])
            {
                u=m-1;
            }
            else if(n>arr[m])
            {
                l=m+1;
            }
            else if(n==arr[m])
            {
                System.out.println("'n' is at "+(m+1)+" position");
                break;
            }
            else
            {
                System.out.println("Not there");
            }
        }
        
    }
}
