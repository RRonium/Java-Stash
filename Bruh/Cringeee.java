public class Cringeee
{
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)                       //Pattern 1
        {
            for(int c=1;c<=i;c++)
            {
                if(c%2==0)
                    System.out.print("#");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i=1;i<=5;i++)                       //Pattern
        {
            for(int c=5;c>=i;c--)
            {
                System.out.print(c);
            }
            System.out.println();
        }
    }    
}