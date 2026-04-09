import java.util.*;
public class Prime
{
    boolean isPrime(int n)
    {
        int flag=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                flag++;
        }
        if(flag==2)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Prime obj =new Prime();
        //System.out.println(obj.isPrime(11));
        for(int i=2;i<=500;i++)
        {
            if(obj.isPrime(i)==true)
                System.out.print(i+",");
        }
    }
}