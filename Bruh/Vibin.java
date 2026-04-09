public class Vibin
{
    public static void main(String args[])
    {
        int n=1;
        for(int i=1;i<=5;i++)
        {
            for(int c=1;c<=i;c++)
            {
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
        
        char arr[] = {'I','C','S','E'};
        for(int i=1;i<=4;i++)
        {
            for(int c=0;c<i;c++)
            {
                System.out.print(arr[c]+" ");
            }
            System.out.println();
        }
    }
}