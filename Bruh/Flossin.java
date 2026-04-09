import java.util.*;
public class Flossin
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        String arr[] =new String[5],tmp="";
        System.out.println("Enter:");        
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.next();
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j].compareToIgnoreCase(arr[j+1])>1)
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
    }
}