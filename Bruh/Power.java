public class Power
{
    void power(int m)
    {
        System.out.println(Math.pow(m,2));
    }
    void power(int m, int n)
    {
        System.out.println(Math.pow(m,n));
    }
    public static void main(String args[])
    {
        Power obj =new Power();
        obj.power(3,4);
        obj.power(3);
    }
}
