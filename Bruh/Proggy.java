import java.util.*;
public class Proggy
{
    
    public int sum(int num)
    {
        int sum = 0;
        while(num>0)
        {
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
    public boolean isMagic(int num)
    {
        while(num>9)
        {
            num=sum(num);
        }
        if(num==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean isComposite(int num)
    {
        int c = 0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                c++;
            }
        }
        if(c>2)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    public static void main(String args[])
    {
        int m=0,n=0,c=0;
        Scanner sc=new Scanner(System.in);
        Proggy obj =new Proggy();
        System.out.print("m = ");
        m = Math.abs(sc.nextInt());
        System.out.print("n = ");
        n = Math.abs(sc.nextInt());
        if(m>=n)
        {
            System.out.println("INVALID");
        }
        else
        {
            c = 0;
            System.out.println("Composite magin integers:");
            for(int i=m; i<=n;i++)
            {
                if(obj.isComposite(i)&&obj.isMagic(i))
                {
                    if(c == 0)
                    {
                        System.out.print(i);
                    }
                    else
                    {
                        System.out.print(", " + i);
                    }
                    c++;
                }
            }
            System.out.println("\nFrequency: " + c);
        }
    }
}