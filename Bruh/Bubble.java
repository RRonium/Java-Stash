import java.util.*;
public class Bubble
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int arr[] = {2,5,1,12,16,14,17,4,3,10},i,j,tmp;
        for(i=0;i<arr.length-1;i++)
        {
            for(j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    tmp=arr[j];
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
