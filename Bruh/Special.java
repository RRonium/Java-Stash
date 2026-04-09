import java.util.*;
class Special
{
    int f,n;
    
    public Special()
    {
        f=0;
        n=0;
    }
    int fact(int a)
    {
        int num=a, res=1;
        System.out.println(num);
        while(num!=0)
        {
            int b=num%10;
            System.out.println(b);
            while(b!=0)
            {
                res*=b;
                b--;
                System.out.println("res: "+res);
            }
            num/=10;
            n+=res;
            res=1;
            System.out.println(n+" "+num+" "+b);
        }
        return n;
    }
    boolean checkSpecial(int b)
    {
        Special obj2 =new Special();
        //System.outrintln(n);
        if(obj2.fact(b)==b)
        {
            return true;
        }
        else
            return false;
    }        
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        
        
        System.out.println("Pls enter a no.: ");
        int N=sc.nextInt();
        
        //Special objmain =new Special();
        Special obj =new Special();
        System.out.println(obj.checkSpecial(N));
    }
} 