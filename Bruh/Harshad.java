import java.util.*;
public class Harshad
{
    public static void main(String[] args)
    {
        int c, n, num,
        sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number plsssss:");
        n=sc.nextInt();
        num=n;
        while (num>0)
        {
            c=num%10;
            sum+=c;
            num/=10;
        }
        if (n%sum==0)
        {
            System.out.println("Harshad Number");
        }
        else
        {
            System.out.println("Not Harshad Number");
        }
    }
}