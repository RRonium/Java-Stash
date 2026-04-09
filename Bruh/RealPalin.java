import java.util.*;
class RealPalin
{
    String str="Hello",rev=str;
    void palin()
    {        
        for(int i=str.length()-1;i>2;i--)
        {
            if(str.charAt(i)==str.charAt(i-1))
                continue;
            else if(str.charAt(i)!=str.charAt(i-1))
                rev=rev.concat(Character.toString(str.charAt(i-1)));
        }
        System.out.println(rev);
    }
    public static void main(String args[])
    {
        
    }
}