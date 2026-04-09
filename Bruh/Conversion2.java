import java.util.*;
public class Conversion2
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter days: ");
        int d=sc.nextInt();
        int m = d/10;
        double day = Math.ceil(d%10);
        System.out.println("Months: " + m + "Days: "+day);
    }
}
