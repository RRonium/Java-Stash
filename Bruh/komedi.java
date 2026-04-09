import java.util.*;
public class komedi
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        String str=sc.next(),s="";
        s=s.concat(Character.toString(str.charAt(str.length()-1)));
        for(int i=0;i<str.length()-1;i++)
        {
            s=s.concat(str.substring(str.length()-i-2,str.length()-i-1));
        }
        System.out.println(s);
        
        char arr[] = str.toCharArray();
        char rev[] =new char[arr.length];
        for(int i=1;i<=arr.length;i++)
        {
            rev[i-1]=arr[arr.length-i];
        }
        String ss =new String(rev);
        System.out.println("Reversed string is: "+ss);
    }    
}