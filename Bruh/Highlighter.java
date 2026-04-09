import java.util.*;
class Highlighter
{
    String s;
    String recur(String str, int i, int j)
    {        
        if(i==str.length())
            return s;
        if(str.indexOf("apple")==i)
        {
            s=s.concat(str.substring(i,i+5));
            str=str.substring(i+5,str.length()-1);
            j=i+5;
            i+=5;
            return recur(str,i,j);
        }
        return recur(str,++i,j);
    }
    public static void main(String args[])
    {
        Highlighter obj =new Highlighter();
        obj.recur("gravitation",0,0);
    }
}