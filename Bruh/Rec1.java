import java.io.*;
import java.util.*;
class Rec1
{
    int n;
    static int fact(int n)
    {
        if(n==0 || n==1)
            return 1;
        int f=n*fact(n-1);
        return f;        
    }
    public static void main(String args[]) throws IOException
    {
        BufferedReader lol =new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(lol.readLine());
        System.out.println("Factorial: "+fact(n));
    }
}