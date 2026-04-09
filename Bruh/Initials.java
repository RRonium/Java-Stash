import java.util.*;
public class Initials
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine(),s="";
        str = str.trim();
        int i,c;
        char ch;
        s=s.concat(Character.toString(Character.toUpperCase(str.charAt(0)))+".");
        for(i=1;i<=str.length();i++)
        {
            //ch = str.charAt(i);
            //str.charAt(i-1)==' ' && str.charAt(i)!=' ')
            if(Character.isWhitespace(str.charAt(i-1))==true && Character.isWhitespace(str.charAt(i))==false)
            {
                //s+=str.charAt(i);
                s=s.concat((Character.toString(Character.toUpperCase(str.charAt(i))))+".");
                
            }

        }
        System.out.println(s);
    }
}