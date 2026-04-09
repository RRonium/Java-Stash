public class CC2
{
    int val1,val2;
    CC2(int a, int b)
    {
        val1=a;
        val2=b;
    }
    CC2(CC obj)
    {
        val1 = obj.a;
        val2 = obj.b;
    }
    public static void main(String[] args)
    {
        CC obj =new CC(2,3);
        CC obj1 = obj;
    }
}
