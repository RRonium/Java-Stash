import java.util.*;
public class VolumeQ1
{
    double vol;
    double volume(double r)             //method 1 with 1 formal parameter
    {
        vol = 4/3*22/7*Math.pow(r,3);
        return vol;
    }
    double volume(double h, double r)       //method 2 with 2 formal parameter
    {
        vol = (22/7)*Math.pow(r,2)*h;
        return vol;
    }
    double volume(double l, double b, double h)     //method 3 with 3 formal parameter
    {
        vol = l*b*h;
        return vol;
    }
    public static void main(String args[])
    {
       int ch;
       double r,h,l,b;
       Scanner sc =new Scanner(System.in);
       VolumeQ1 obj =new VolumeQ1();
       System.out.println("Please enter 1 for the volume of a sphere, 2 for the volume of a cylinder, 3 for the volume of a cuboid.");
       ch = sc.nextInt();
       switch(ch)               //switch for making the program menu-driven
       {
           case 1:
           System.out.println("Enter the radius: ");
           r = sc.nextDouble();
           System.out.println(obj.volume(r));
           break;
           
           case 2:
           System.out.println("Enter the radius: ");
           r = sc.nextDouble();
           System.out.println("Enter the height: ");
           h = sc.nextDouble();
           System.out.println(obj.volume(h,r));
           break;
           
           case 3:
           System.out.println("Enter the length: ");
           l = sc.nextDouble();
           System.out.println("Enter the breadth: ");
           b = sc.nextDouble();
           System.out.println("Enter the height: ");
           h = sc.nextDouble();
           System.out.println(obj.volume(l,b,h));
           break;
           
           default:
            System.out.println("INVALID");
            break;
       }
    }
}
