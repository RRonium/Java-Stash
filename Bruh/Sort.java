import java.util.*;
public class Sort
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int arr[] = {1,5,2,6,3,7,4,9,0,8},i,j,tmp;
        for(i=0; i<arr.length-1;i++)
        {
            for(j=0; j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    tmp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
        for(i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+", ");
        }        
    }
}
