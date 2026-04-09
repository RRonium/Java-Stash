public class Nemesis
{
    public static void main(String args[])
    {
        int n1=10,n2=2;
        System.out.println("Values after swapping:-  num1="+n1+"   num2="+n2);
        n1=n1-n2;
        n2=n1+n2;
        n1=n2-n1;
        System.out.println("Values after swapping:-  num1="+n1+"   num2="+n2);
    }
}