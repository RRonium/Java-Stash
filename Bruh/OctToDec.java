import java.util.*;
class OctToDec
{
    void convert(int n)
    {
        int num=n,rem=0,i=0;
        while(num!=0)
        {
            //rem*=10;
            rem+=(num%10)*Math.pow(8,i);
            i++;
            num/=10;
        }
        System.out.println(rem);
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        OctToDec obj =new OctToDec();
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        obj.convert(n);
    }
}