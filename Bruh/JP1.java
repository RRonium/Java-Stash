import java.util.*;
public class JP1
{
    public static void main(String[] args) 
    {
        //Prog1
        /*Scanner sc =new Scanner(System.in);
        char ch1,ch2;
        int sum=0,diff=0;
        System.out.println("Enter 2 characters. : ");
        ch1 = sc.next().charAt(0);
        ch2 = sc.next().charAt(0);      

        sum=(int)ch1+(int)ch2;
        diff=(int)ch1-(int)ch2;

        System.out.println("Sum: "+sum);
        System.out.println("Difference: "+ Math.abs(diff));*/

        
        
        //prog2
        /*
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch=sc.next().charAt(0);
        int n = (int)ch+1;
        ch = (char)n;
        System.out.println(ch);
        */
       
       
        //prog3
        /*Scanner sc =new Scanner(System.in);
        char ch;       
        System.out.println("Enter a character pls: ");
        ch=sc.next().charAt(0);
        
        if(Character.isLetter(ch)==true)
        {
            if(Character.isLowerCase(ch)==true)
                System.out.println("Entered character: "+ch+" Case : Lower");
            else
                System.out.println("Entered character: "+ch+" Case : Upper");
        }
        else if(Character.isDigit(ch)==true)
        {
                System.out.println("Entered digit: "+ch+" it's a digit");
        }
        else if(Character.isLetterOrDigit(ch)==false)
        {
               System.out.println("Entered special symbol "+ch);
        }*/
        
        
        //prog4
        Scanner sc =new Scanner(System.in);
        String str,s="";
        System.out.println("Enter a String pls: ");
        str=sc.nextLine();
        
        
    }
}