import java.util.*;
class TriNum
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter the limit: ");
        int n=sc.nextInt(),res=3;        
        for(int i=0;i<=n;i++)
        {
            res+=i;
            System.out.print(res+", ");
        }
    }
}   