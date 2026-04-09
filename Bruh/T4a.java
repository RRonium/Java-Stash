public class T4a
{
    public static void main(String args[]) {
        int res = 0,i,c,j;
        for (i = 1; i <= 10; i++)
        {
            c = 1;
            for ( j = 1; j <= i; j++)
            {
                c *= j;
            }
            res += c;
        }
        System.out.println(" Result= " + res);
    }
}