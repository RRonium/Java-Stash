import java.util.*;
public class ArrQ3
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int i,c,j,res=0;
        int []arr=new int[5];
        for(j=0;j<arr.length;j++)
        {
            arr[j]=sc.nextInt();
        }
        for(i=1;i<arr.length;i++)
        {
            c=i-1;
            res=Math.max(arr[c],arr[i]);          
        }
        System.out.println("Max No.: "+res);
    }
}
