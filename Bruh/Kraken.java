import java.util.*;
public class Kraken
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter String pls: ");
        String str=sc.next(),rev="";
        char c1,c2;
        int c=0;
        for(int i=1;i<str.length();i++)
        {
            c1=str.charAt(i-1);
            c2=str.charAt(str.length()-i);
            if(c1!=c2)
               {
                   c++;
                   System.out.println("Not a palidrome");
                   break;
               }        
            
        }
        if(c==0)
        {
            System.out.println("Palindrome");
            System.exit(0);
        }
       for(int i=1;i<=str.length();i++)
       {
           rev=rev.concat(Character.toString(str.charAt(str.length()-i)));
       }
       str=str.concat(rev);
       System.out.println("Palindrome is now:" +str);
    }
}