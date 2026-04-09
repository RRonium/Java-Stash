import java.util.*;
public class Eve
{
    void series()
    {
        int res=0,x=2;
        for(int i=1;i<=20;i++)
        {
            if(i%2==0)
            {
                res-=Math.pow(x,i);
            }
            else
            {
                res+=Math.pow(x,i);
            }
        }        
    }
    void series(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int c=1;c<=i;c++)
            {
                System.out.print("1");
            }
            System.out.print("\t");
        }
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        Eve obj =new Eve();
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        //obj.series();
        obj.series(n);        
    }
}