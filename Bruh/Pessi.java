import java.util.*;
public class Pessi
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        char arr[] =new char[10];
        int res[] =new int[10],tmp=0;
        System.out.println("Enter: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.next().charAt(0);
            res[i]=(int)arr[i];
        }
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(res[j]>res[j+1])
                {
                    tmp=res[j];
                    res[j]=res[j+1];
                    res[j+1]=tmp;
                }
            }
        }
        for(int j=0;j<arr.length;j++)
        {
            System.out.print((char)res[j]+" ");
        }
    }
}