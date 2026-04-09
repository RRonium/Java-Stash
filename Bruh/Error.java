import java.util.*;
class Error
{
    public boolean f(int a, int b)
    {
        boolean c = false;
        while(a>1 && b>1)
        {
            if(a>b)                          
                a-=b;
            else
                b-=a;
        }
        if(a==1||b==1)                   
            c=true;
        return(c);
    }
    public static void main(String args[])
    {
        Error obj =new Error();
        System.out.println(obj.f(2,2));
    }
}