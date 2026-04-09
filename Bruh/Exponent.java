import java.util.*;
public class Exponent
{
    public static void main()
    {
        System.out.println("Enter a base number:");
        Scanner b =new Scanner(System.in);
        int base= b.nextInt();
        
        System.out.println("Enter an exponential value:");
        Scanner ex =new Scanner(System.in);
        int exnum= ex.nextInt();
        int counter = 1;
        int result = 1;
        while(counter<=exnum)
        {
            result = result * base;
            System.out.println("This is result:" + result);
            counter++;
        }
        System.out.println("This is:"+ result);
    }
}