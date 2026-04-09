public class Ghost
{
    public static void main(String args[])
    {
        String str = "BLUEJ";
        for(int i=1;i<=5;i++)
        {
            for(int c=1;c<=i;c++)
            {                
                System.out.print(str.charAt(str.length()-i));                   
            }
            System.out.println();
        }
    }
}