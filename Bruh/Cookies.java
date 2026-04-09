import java.util.*;
public class Cookies
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter no. pls: ");
        int num = sc.nextInt(),n=num,r,sum=0,pro=1;        
        while(n!=0)
        {
            r=n%10;
            sum+=r;
            pro*=r;
            n/=10;
        }
        if(num==(sum+pro))
        {
            System.out.println("Special no.");
        }
        else if(num!=(sum+pro))
        {
            System.out.println("Not a special no.");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}