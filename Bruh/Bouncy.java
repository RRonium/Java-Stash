import java.util.*;
class Bouncy
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n=sc.nextInt();
        String str=Integer.toString(n).trim();
        int len=str.length();
        
        for(int i=1;i<len;i++)
        {
            if(str.charAt(i-1)<=str.charAt(i))
            {
                continue;
            }
            else
            {
                System.out.println("Not a Bouncy number");
                System.exit(0);
            }            
        }
        System.out.println("Bouncy number");
    }
}