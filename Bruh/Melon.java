import java.util.*;
public class Melon
{
    void print()
    {
        int n=1;
        for(int i=1;i<=5;i++)
        {
            for(int c=1;c<=i;c++)
            {
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
    boolean print(int n)
    {
        int sum=0,num=n,rem=0;
        while(num!=0)
        {
            rem=num%10;
            sum+=rem;
            num/=10;
        }
        if(Math.pow(sum,3)==n)
        {
            return true;
        }
        else
            return false;
    }
    void print(int a,char ch)
    {
        if(ch=='s'||ch=='S')
        {
            System.out.println(Math.pow(a,2));
        }
        else if(ch=='c'||ch=='C')
        {
            System.out.println(Math.pow(a,3));
        }
        else
            System.out.println("INVALID");
    }
    public static void main(String args[])
    {
        Melon obj =new Melon();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a numbmer for dudency check: ");
        int n=sc.nextInt();
        System.out.println("Enter  number:");
        int a=sc.nextInt();
        System.out.println("Enter c or C for cube and s or S for Square of number: ");
        char ch=sc.next().charAt(0);
        
        obj.print();
        obj.print(n);
        obj.print(a,ch);
    }
}