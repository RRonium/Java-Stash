import java.util.*;
public class Magic
{
    void meth(int num)
    {
        int n = num,rem,res=0;
        while(res!=1)
        {
            while(n!=0)
            {
                rem=n%10;
                n/=10;
                res+=rem;
                System.out.println(res);
            }
            n=res;
        }
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        Magic obj =new Magic();
        System.out.println("Enter a no. : ");
        int num=sc.nextInt();
        obj.meth(num);
    }
}
