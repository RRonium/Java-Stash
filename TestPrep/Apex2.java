import java.util.*;
class Apex2
{
    /*int x;
    void accept()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter a number: ");
        x=sc.nextInt();
    }*/
    boolean isPalin(int n)
    {
        int num=n,rev=1;
        while(num!=0)
        {
            rev*=10;
            rev+=(num%10);
            num/=10;
        }
        if(n==rev)
            return true;
        else
            return false;
    }
    boolean isPrime(int n)
    {
        int c=0;
        for(int i=2;i<n;i++)
        {
            if(n%1==0)
                c++;
        }
        if(c==0)
            return true;
        else
            return false; 
    }
    void compute()
    {
        int flag=0;
        for(int i=10;;i++)
        {
            if(flag==10)
                break;
            if(isPrime(i)==true && isPalin(i)==true)              
            {
                System.out.println(i+", ");
                flag++;
            }
        }
    }
    public static void main(String args[])
    {        
        Apex2 obj =new Apex2();
        obj.compute();
    }
}