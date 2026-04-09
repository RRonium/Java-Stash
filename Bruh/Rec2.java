import java.util.*;
import java.io.*;
class Rec2
{
    static int a=0,b=1;
    static void fib(int a, int b, int n)
    {
       if(n==0)
        return;
       int m=a+b;
       System.out.println(m);
       fib(b,m,n-1);
    }
    public static void main(String args[]) throws IOException
    {
        BufferedReader obj =new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(obj.readLine());
        fib(a,b,n-2);
    }
}