import java.util.*;
public class Emirp
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt(),rev=0,n=num,flag=0,rem=0;
        while(n!=0)
        {
            rem=n%10;
            rev*=10;
            rev+=rem;
            n/=10;
        }
        System.out.println("Reversed: "+rev);
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                flag++;
            }
        }
        for(int i=1;i<=rev;i++)
        {
            if(rev%i==0)
            {
                flag++;
            }
        }
        
        //System.out.println(flag);
        if(flag==4)
            System.out.println(num+" is Emirp");
        else
        {
            System.out.println("Not emirp");
        }
    }
}