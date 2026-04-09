import java.util.*;
public class BSearch3
{
    static int a[]=new int[10];
    static int sk;
    static boolean search(int a[], int len, int sk)
    {
        int flag=0;
        while(flag==0)
        {
        for(int i=0;i<a.length;i++)
        {
                       
                if(a[i]==sk)
                {
                   flag=1;
                   break;
                }
               
        }}
        return flag==1?true:false;
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter value:");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
            
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+", ");
        }
        System.out.println("Enter search key: ");
        sk=sc.nextInt();
        System.out.println(search(a,a.length,sk));
    }
}
