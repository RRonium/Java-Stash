class Tempobj
{
    public int scissors()
    {
        return 2*2;
    }
    public static void main(String args[])
    {
        int a = new Tempobj().scissors();
        System.out.println(a);
    }
}