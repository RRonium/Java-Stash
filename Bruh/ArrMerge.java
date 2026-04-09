import java.util.*;
public class ArrMerge
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter sizes for 2 arrays: ");
        int a1=sc.nextInt(), a2=sc.nextInt(),c=0;
        int arr1[] =new int[a1];
        int arr2[] =new int[a2];
        int arr3[] =new int[a1+a2];
        
        System.out.println("Enter elements for first array: ");
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }
        
        System.out.println("Enter the elements for the second array: ");
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i]=sc.nextInt();
        }
        
        for(int i=0; i<arr3.length;i++)
        {
            if(i<arr1.length)
                arr3[i]=arr1[i];
            else
            {
                arr3[i]=arr2[c];
                c++;
            }
        }
        
        System.out.println("Merged array: ");
        for(int i=0;i<arr3.length;i++)
        {
            System.out.print(arr3[i]+", ");
        }
    }
}