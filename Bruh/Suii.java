import java.util.*;
class Suii
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter no. pls: ");
        int num = sc.nextInt(),n=num,sum=0,pro=1,r=0;
        
        while(n!=0)
        {
            r=n%10;
            n/=10;
            sum+=r;
            pro*=r;
        }
        System.out.println(sum==pro?"Spy no.":"Not a spy no.");
    }
}