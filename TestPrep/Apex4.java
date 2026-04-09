import java.util.*;
class Apex4
{
    static boolean isPrime(int n)
    {
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }    
    static void Goldbach(int n)
    {
        for(int i=3;i<=n/2;i+=2)
        {
            if(isPrime(i)==true)
            {
                if(isPrime(n-i)==true)
                {
                    System.out.println(i+","+(n-i));
                }
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter an even no.");
        int num=sc.nextInt();
        if(num>=1 && num<=50)
        {
            if(num%2==0)
                Goldbach(num);
            else
                System.out.println("Invalid Input");
        }
        else
            System.out.println("Invalid input");
    }
}