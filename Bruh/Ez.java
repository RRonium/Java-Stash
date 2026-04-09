import java.util.*;
class Ez
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a unique string pls: ");
        String str=sc.nextLine();
        char ch1,ch2;
        for(int i=0;i<str.length();i++)
        {
            ch1=str.charAt(i);
            for(int c=i+1;c<str.length();c++)
            {
                ch2=str.charAt(c);
                if(ch1==ch2)
                {
                    System.out.println("String isn't unique");
                    System.exit(0);
                }
            }
        }
        System.out.println("The String is unique");
    }
}