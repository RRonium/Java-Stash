import java.util.*;
public class Rofl
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter no. : ");
        int num = sc.nextInt(),rem=0,sum=0,pro=1;
        int n=num;
        while(n>0)
        {
            rem=n%10;
            sum+=rem;
            pro*=rem;
            n/=10;
        }
        System.out.println("Sum: "+sum);
        System.out.println("Product: "+pro);
        
    }
}