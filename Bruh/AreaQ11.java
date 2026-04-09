import java.util.*;
public class AreaQ11
{
    double area;
    double area(double a, double b, double c)               //area of a triangle calculation
    {
        double s = (a+b+c)/2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }
    double area(int a, int b, int height)                   //area of a trapezium calculation
    {
        area = (double)1/2*(a+b)*height;
        return area;
    }
    double area(double diagonal1, double diagonal2)         //area of a rhombus calculation
    {
        area = (double) 1/2*diagonal1*diagonal2;
        return area;
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        AreaQ11 obj =new AreaQ11();
        double x,y,z;
        int height,l,m;
        System.out.println("Enter 1 for the area of scalene triangle, 2 for the area of a trapezium, 3 for the area of a rhombus: ");
        int ch=sc.nextInt();            //accepting the user's choice
        switch(ch)                      //method allocation based on the user's choice
        {
            case 1:
            System.out.println("Enter side 1: ");
            x = sc.nextDouble();
            System.out.println("Enter side 2: ");
            y = sc.nextDouble();
            System.out.println("Enter side 3: ");
            z = sc.nextDouble();
            System.out.println(obj.area(x,y,z));
            break;
            
            case 2:
            System.out.println("Enter parallel side 1 : ");
            l = sc.nextInt();
            System.out.println("Enter parallel side 2: ");
            m = sc.nextInt();
            System.out.println("Enter height: ");
            height = sc.nextInt();
            System.out.println(obj.area(l,m,height));
            break;
            
            case 3:
            System.out.println("Enter diagonal 1 : ");
            x = sc.nextDouble();
            System.out.println("Enter diagonal 2: ");
            y = sc.nextDouble();
            System.out.println(obj.area(x,y));
            break;
        }
    }
}
