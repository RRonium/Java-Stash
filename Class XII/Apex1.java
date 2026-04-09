public class Apex1 implements I1,I2
{
    public void msg1()
    {
        System.out.println("msg1");
    }
    public void disp1()
    {
    }
    public void msg2()
    {
        System.out.println("msg2");
    }
    public static void main(String args[])
    {
        Apex1 t1=new Apex1();
        t1.msg1();
        t1.msg2();
        t1.display();
    }
}