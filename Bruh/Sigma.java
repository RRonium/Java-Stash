import java.util.*;
class Sigma
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int arr[] = {9,5,1,6,4,2},tmp=0,l=0,u=arr.length-1,m=0,sk=0;
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
        System.out.println("Enter search key: ");
        sk=sc.nextInt();
        
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
                System.out.println("Search key found at position: "+(m+1));
                break;
            }
            else
            {
                System.out.println("Not there");
            }
        }
    }
}