public class CC
{
    int a,b;
    CC(int x, int y)
    {
        a=x;
        b=y;
    }
    CC(CC ob)
    {
        a=ob.a;
        b=ob.b;
    }
    public static void main(String[] args)
    {
        CC ob =new CC(5,6);
        CC ob1 =new CC(ob); 
    }
}
