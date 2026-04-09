package geopack;
import java.util.*;
class Tester
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please Enter ur choice: ");
        System.out.println("1. Circle");
        System.out.println("2. Ellipse");
        System.out.println("3. Rectangle");
        int ch=sc.nextInt();
        
        switch(ch)
        {
            case 1:
                System.out.println("Enter radius: ");
                int r=sc.nextInt();
                Circles obj1 =new Circles(r);
                break;
            case 2:
                System.out.println("Enter major axis length: ");
                int maj=sc.nextInt();
                System.out.println("Enter minor axis length: ");
                int min=sc.nextInt();
                Ellipse obj2 =new Ellipse(maj,min);
                break;
            case 3:
                System.out.println("Enter length: ");
                int l=sc.nextInt();
                System.out.println("Enter width: ");
                int b=sc.nextInt();
                Rectangle obj3 =new Rectangle(l,b);
                break;
            default:
                System.out.println("Invalid");
        }
    }
}