import java.util.*;
public class PolygonQ19
{
    void polygon(int n, char ch) 
    {
        for (int i = 1; i <= n; i++)            //loop for the first pattern
        {
            for (int j = 1; j <= n; j++) 
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    void polygon(int x, int y) 
    {
        for (int i = 1; i <= x; i++)            //loop for the second pattern
        {
            for (int j = 1; j <= y; j++)
            {
                System.out.print('@');
            }
            System.out.println();
        }
    }
    void polygon() 
    {
    for (int i = 1; i <= 3; i++) //loop for the third pattern
    {
        for (int j = 1; j <= i; j++) 
        {
            System.out.print('*');
        }
        System.out.println();
    }
    }
    public static void main(String args[]) 
    {
        Scanner sc =new Scanner(System.in);
        int x,y,n,ch;
        System.out.println("Please enter the values for the first loop: ");
        n=sc.nextInt();                         //accepting the values
        ch=sc.next().charAt(0);
        System.out.println("Please enter the values for the second loop: ");
        x=sc.nextInt();
        y=sc.nextInt();
        PolygonQ19 obj = new PolygonQ19();
        obj.polygon(n,ch);              
        System.out.println();
        obj.polygon(x,y);
        System.out.println();
        obj.polygon();
    }
}
    