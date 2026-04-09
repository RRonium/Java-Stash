import java.util.*;
class Apex5
{
    static void Upshift(int arr[][])
    {
        int n=arr.length;
        int top[]=arr[0];        
        for(int i=1;i<n;i++)
        {
            arr[i-1]=arr[i];
        }        
        arr[n-1]=top;
    }
    static void Rotation(int arr[][])
    {
        //transverse
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                int temp;
                temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        //reverse
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length/2;j++)
            {
                int temp;
                temp=arr[i][j];
                arr[i][j]=arr[i][arr.length-1-j];
                arr[i][arr.length-1-j]=temp;
            }
        }
    }
    static void display(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i][j]+", ");                
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int arr[][] = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        System.out.println("Original Matrix");
        display(arr);
        Rotation(arr);
        System.out.println("New Matrix");
        display(arr);
        System.out.println("Upshift:");
        Upshift(arr);
        display(arr);
    }
}