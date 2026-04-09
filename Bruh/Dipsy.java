import java.util.*;
public class Dipsy
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        int n=num,r=0,res=0,f=1;
        while(n>0)
        {
            r=n%10;
            n/=10;
            f=1;
            for(;r>0;r--)
            {
                f*=r;
            }
            res+=f;
        }        
        System.out.println(res==num?"Special no.":"Not a Special no.");
    }
}