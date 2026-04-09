public class Floyd
{
    public static void main(String[] args)
    {
        int n=1;
        for (int i=1;i<=5;i++)
        {
            for (int c=1;c<=i;c++)
            {
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
    }
}