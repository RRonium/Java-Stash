import java.util.*;
class Phone
{   static int flag=0;
    static void dial(String str)
    {
        str=str.toUpperCase();
        String arr[] ={"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length();j++)
            {
                for(int c=0;c<str.length();c++)
                {
                    if(str.charAt(c)==arr[i].charAt(j))
                    {
                        flag+=(j+1);
                    }
                }
            }
        }
    }
    static void disp()
    {
        System.out.println("No. of keystrokes: "+flag);
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a String pls: ");
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            if(Character.isLetter(str.charAt(i))==false)
            {
                System.out.println("Invalid input");
                System.exit(0);
            }
        }
        dial(str);
        disp();
    }
}