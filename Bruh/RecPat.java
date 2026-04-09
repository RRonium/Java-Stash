import java.util.*;
class RecPat
{
    /*int pat(int n)
    {        
        if(n==0)
        {
            return 0;
        }
        System.out.print("*");
        return pat(--n);
    }*/
    void tri(int r,int c)
    {
        if(r>5)
            return;
        if(c<=r)
        {
            System.out.print("*");
            tri(r,c+1);
        }
        else
        {
            System.out.println();
            tri(r+1,0);
        }
    }
    public static void main(String args[])
    {
        RecPat obj=new RecPat();
       // obj.pat(4);
        obj.tri(0,0);
    }    
}