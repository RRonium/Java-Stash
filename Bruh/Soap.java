public class Soap
{
    public static void main(String args[])
    {
        String str = "BLUEJ",s="";
        System.out.println(str);
        for(int i=1;i<str.length();i++)
        {           
                s = s.concat(str.substring(i)).concat(str.substring(0,i));
                System.out.println(s);          
                s="";
        }
    }
}