import java.util.*;
class Submarine
{
    int N;
    void accept()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number: ");
        N=sc.nextInt();
        if(N<=9 || N>=50 || N%2!=0)
            System.exit(0);              
    }
    boolean isprime(int n)
    {
       int flag=0;
       for(int i=2;i<n;i++)
       {
           if(n%i==0)
            flag++;           
       }
       if(flag==0)
        return true;
       else
        return false;
    }
    void goldbach()
    {
        for(int i=2;i<=(N/2);i++)
        {
            if(isprime(i)==true)
            {
                if(isprime(N-i)==true && (N-i)!=1)
                {
                    System.out.println(i+","+(N-i));
                }
                else
                {
                    continue;
                }
            }
            else
            {
                continue;
            }
        }
    }
    public static void main(String args[])
    {
        Submarine obj =new Submarine();
        obj.accept();
        obj.goldbach();
    }
}