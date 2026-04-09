public class Rough_Classes
{
    public static void main(String args[])
    {
        int s[] = {1,2,3,4,5};
        int x[]=s;
        for(int n=0;n<x.length;n++)              
            x[n]=s[n]+x[n];
        for(int n=0;n<s.length;n++)
            System.out.print(s[n]+" ");
            //System.out.println(s[n]+" "+x[n]+" ");
    }
}
