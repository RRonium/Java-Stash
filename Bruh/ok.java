import java.util.*;
class ok
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number pls: ");
        int num=sc.nextInt(),n=num,res=1;        
        while(n!=0)
        {
            if((n%10)%2==0)
            {
                res*=((n%10)+1);
                n/=10;
            }
            n/=10;
        }
        System.out.println("Result: "+res);
    }
}