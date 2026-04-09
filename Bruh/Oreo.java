import java.util.*;
public class Oreo
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Pls enter a word: ");
        String str = sc.nextLine().trim();
        int flag=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==str.charAt(str.length()-i-1))
            {
                flag++;
            }            
        }
        if(flag==str.length())
        {
            System.out.println("Palidrome");
            System.exit(0);
        }
        else
        {
            System.out.println("Not a Palidrome");
        }
        if(str.charAt(0)==str.charAt(str.length()-1))
        {
            System.out.println("Special word.");
        }
        else if(str.charAt(0)!=str.charAt(str.length()-1))
        {
            System.out.println("Neither a Palidrome nor a Special word.");
        }
        else
        {
            System.out.println("INVALID");
        }
    }
}