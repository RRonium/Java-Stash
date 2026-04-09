import java.util.*;
class Nike
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a line pls: ");
        String str = sc.nextLine();
        int flag=0,end=0,begin=0;
        char ch;
        str=str.toUpperCase();
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            switch(ch)
            {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    flag++;
                    break; 
                case ' ':
                   begin=end;                
                   end=i;
                   System.out.println("NO OF VOWELS PRESENT IN "+str.substring(begin,end)+" is:"+flag);
                   flag=0;
                   break;
            }
        }
    }
}