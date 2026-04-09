import java.util.*;
class Automorphic2
{
    public static void main()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number: ");
        double n=sc.nextDouble();
        String str=Double.toString(n);
        int len=str.length();
        double tenner=Math.pow(10,len);
        if(Math.pow(n,2)%tenner==n)
            System.out.println("Number is Automorphic");
        else
            System.out.println("Number isn't Automorphic");
    }
}