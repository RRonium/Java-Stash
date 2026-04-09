import java.util.*;
class Recur2
{    
    static int arr[] ={1,2,4,7,3,9};
    static int res=0,i=0;
    static void rec(int n)
    {
        res+=n;
        System.out.print(res+" ");
        rec(arr[++i]);
        if(i==arr.length)
            System.exit(0);
    }
    public static void main(String args[])
    {
        rec(arr[0]);
    }        
}