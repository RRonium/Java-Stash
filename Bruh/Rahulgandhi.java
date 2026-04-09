import java.util.*;
public class Rahulgandhi
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a String pls: ");
        String str = sc.nextLine().trim();
        char arr[] = str.toCharArray();
        int flag=0;
        System.out.println("Duplicate characters: ");
        for(int i=0;i<str.length();i++)
        {
            for(int c=i+1;c<str.length();c++)
            {
                if(str.charAt(i)==str.charAt(c))
                {
                    //System.out.println(str.charAt(i));
                    continue;
                }             
                 
                
            }                    
            
        }
    }
}