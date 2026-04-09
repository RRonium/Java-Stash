import java.util.*;
class MockT
{
    int m=0,n=0,flag=0;
    void accept()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter two numbers: ");
        m=sc.nextInt();
        n=sc.nextInt();
        
        if(m>=n)
            System.exit(0); 
    }
    boolean isprime(int n)
    {
            for(int j=2;j<n;j++)
            {
                if(n%j==0)
                {
                    //System.out.println("hi");
                    return false;
                }
            }        
            //System.out.println("hi1");
            return true;
    }
    int rev(int n)
    {
        int nn=n,rev=0;
        while(nn!=0)
        {
            rev*=10;
            rev+=(nn%10);
            nn/=10;
            
        }
               // System.out.println(rev);
        return rev;
    }    
    boolean isadam(int n)
    {
        int sq = n*n;
        int n_rev=rev(n),sq_rev=(n_rev*n_rev);
        //int sq_rev=rev(sq);
        //System.out.println(n+", "+n_rev);
        if(sq_rev!=rev(sq))
            return false;
            //System.out.println("hi3");
            return true;
    }
    void master(MockT obj)
    {
        int c=0;
        System.out.println("Prime-Adam numbers: ");
        for(int i=m;i<=n;i++)
        {
            if(i==1 || i==0)
            {
                System.out.println("Not Prime-Adam");
                System.exit(0);
            }
            if(i<=10)
                continue;
            if(isprime(i)==false || isadam(i)==false)
            {
                continue;
            }
            System.out.print(i+", ");
            c++;
        }
        System.out.println("Frequency: "+c);
    }
    public static void main(String args[])
    {
        MockT obj =new MockT();
        obj.accept();
        obj.master(obj);
    }
}