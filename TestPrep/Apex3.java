import java.util.*;
class Apex3
{
    void dupcheck(int arr[])
    {
        int fresh[] =new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<arr.length;j++)
            {
                if(arr[j]==arr[i])
                {
                    arr[j]=;
                }                                
            }            
        }
        disp(fresh);
    }
    void disp(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+", ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        Apex3 obj =new Apex3();
        System.out.println("Enter 5 no.:");
        int arr[] =new int[5];
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        obj.dupcheck(arr);
    }
}