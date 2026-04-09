class Kanye
{
    static int num;
    Kanye()
    {
        num = 10;
    }
    Kanye(int num)
    {
        this.num=num;
    }
    public static void main(String args[])
    {
        Kanye west =new Kanye();        //default
        System.out.println(num);
        Kanye west2 =new Kanye(10);        //parameterized
        System.out.println(num);
        int x=4;
        x+=(x++)+(++x)+x;
        System.out.println(x);
    }
}