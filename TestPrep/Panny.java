import java.util.*;
class Panny
{
    char ch[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    String str;
    void accept()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a String: ");
        str=sc.nextLine();
        System.out.println("Entered String: "+str);        
    }
    boolean isPangram(String s1)
    {
        for(int i=0;i<s1.length();i++)
        {
            for(int j=0;j<ch.length;j++)
            {
                if(s1.charAt(i)==ch[j])
                {
                    ch[j]='*';
                }                
            }
        }
        
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]!='*')
                return false;              
        }
        return true;
    }
    void disp()
    {
        System.out.println("Pangram check result: "+isPangram(str));
    }
    public static void main(String args[])
    {
        Panny obj =new Panny();
        obj.accept();
        obj.disp();
    }
}