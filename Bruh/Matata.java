import java.util.*;
public class Matata
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Pls enter String in uppercase: ");
        String str = sc.nextLine();                
        for(int i=0;i<str.length();i++)
        {
            if(Character.isUpperCase(str.charAt(i))==false)
            {
                System.out.println("Invalid input....enter string in uppercase pls :)");
                System.exit(0);
            }
        }
        char arr[] = {'A','E','I','O','U'}; 
        int flag=0;                   
        for(int c=0;c<arr.length;c++)
        {
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)==arr[c])
                {
                    flag++;
                }                
            }
            System.out.println(" Frequency of '"+arr[c]+"' : "+flag);
            flag=0;
        }
            
    }
}