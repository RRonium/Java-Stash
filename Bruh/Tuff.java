import java.util.*;
class Tuff
{
    
    
    boolean palindrome(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=str.charAt(str.length()-i-1))
            {
                return false;
            }
        }
        return true;
    }
    boolean special(String str)
    {
        if(str.charAt(0)==str.charAt(str.length()-1))
        {
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        Tuff obj =new Tuff();
        System.out.println("Enter a String pls:");
        String str=sc.nextLine().trim();
        if(obj.palindrome(str)==true)
        {
            System.out.println("String is a palindrome");
        }
        else
        {
            if(obj.special(str)==true)
            {
                System.out.println("String not palindrome but is special");
            }
            else
            {
                System.out.println("String neither palindrome nor special");
            }
        }       
        
    }
}