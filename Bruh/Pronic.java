import java.util.*;
public class Pronic
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a no.: ");
        int num = sc.nextInt();
        int n =num,i;
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                if(n%(i+1)==0)
                {
                    if(i*(i+1)==num)
                    {
                        System.out.println(num+" is a pronic no.");
                        System.exit(0);
                    }
                }
            }
        }
        System.out.println("Not a pronic no.");
    }
}
