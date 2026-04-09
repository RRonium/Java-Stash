import java.util.*;
class Seven
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter the range: ");
        int p=sc.nextInt();
        int q=sc.nextInt();        
        System.out.println("Buzz numbers: ");
        for(int i=p;i<=q;i++)
        {
            if(i%10==7 || i%7==0)
            {
                System.out.println(i);
            }
        }
    }
}