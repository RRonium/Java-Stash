import java.util.*;
public class ArrComp
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int arr[] =new int[10];
        int i;
        System.out.println("Enter 10 numbers for the array: ");
        for(i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=arr[0],min=arr[0];
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
                max=arr[i];
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println("Largest: "+max);
        System.out.println("Smallest: "+min);
    }
}
