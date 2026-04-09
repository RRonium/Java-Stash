import java.util.*;
class CircularP
{
    int num=0;
    void accept()
    {
        Scanner sc =new Scanner(System.in);
        num=sc.nextInt();
        if(num==1||num==0)
            System.out.println("Not a Cicular prime no.");
    }
    boolean isprime(int nn)
    {
        int n=nn;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
                return false;                    
        }
        return true;
    }
    void gen(CircularP obj)
    {
        int n=num,nn=0,dig=0;
        while(n!=0)
        {
            n/=10;
            dig++;
        }
        System.out.println(dig);
        n=num;
        for(int i=1;i<=dig;i++)
        {
            nn=(n%10)*(int)Math.pow(10,dig-1)+(n/(int)Math.pow(10,1));
            //System.out.println(nn);
            if(isprime(nn)==false)
            {
                System.out.println("Not Cicular Prime");
                System.exit(0);
            }
            
        }
        System.out.println("No. is Circular Prime");
    }
    public static void main(String args[])
    {
        CircularP obj =new CircularP();
        obj.accept();
        obj.gen(obj);
    }
}