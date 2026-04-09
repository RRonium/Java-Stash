import java.util.*;
class DectoHex
{
    void convert(int n)
    {
        int num=n;
        double rem=0;
        //String str="";
        int arr[] =new arr[];
        while(num!=0)
        {
            rem=num%16;        
            if(rem>9)
            {
                rem=(char)(rem+55);
            }
            System.out.print(rem);
            num/=10;
        }
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        DectoHex obj =new DectoHex();
        System.out.println("Please enter a denary no.: ");
        int n = sc.nextInt();
        obj.convert(n);
    }
}