import java.util.*;
public class Shershaah
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        double arr[] =new double[20],tmp=0.0;
        System.out.println("Enter 20 values: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextDouble();
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+", ");
        }
        for(int i=0;i<arr.length-1;i++)
        {
            for(int c=0;c<arr.length-i-1;c++)
            {
                if(arr[c]>arr[c+1])
                {
                    
                }
            }
        }
        
        
    }
}