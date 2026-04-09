import java.util.*;
public class Llamaz
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        double arr[] =new double[10];
        double temp=0.0;
        System.out.println("Enter elements pls: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextDouble();
        }
        System.out.println("Unsorted: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+", ");
        }             
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[i]<arr[i+1])
                {
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        System.out.println("Sorted: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+", ");
        }
    }
}