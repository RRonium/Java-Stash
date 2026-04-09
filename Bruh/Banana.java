import java.util.*;
public class Banana
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int arr[] =new int[10];
        int tmp=0;
        System.out.println("Enter 10 value for the array: ");
        //accepting values for the array
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        //Displaying the array
        System.out.println("Unsorted array: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+", ");
        }
        //Bubble sort
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    tmp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
        //print sorted array
        System.out.println();
        System.out.println("Sorted array: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+", ");
        }
    }
}