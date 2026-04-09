import java.util.*;
class Fib
{
    int fib(int n)
    {    
         return fib(n - 1) + fib(n - 2);
    }    
    public static void main(String args[])
    {
        int n = 10;
        Fib obj =new Fib();
        for (int i=2;i<n; i++) 
        { 
            System.out.print(obj.fib(i) + " ");
        }
    }
}