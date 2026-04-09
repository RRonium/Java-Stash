package Shape3D;
import java.util.*;
class Sphere extends Shape3D
{
    int r;
    Sphere(int radius)
    {
        r=radius;
    }
    public void calculateVolume()
    {
        System.out.println("Volume is: "+(4/3)*Math.PI*Math.pow(r,3));
    }
    public void calculateSurfaceArea()
    {
        System.out.println("Surface area is: "+ 4*Math.PI*Math.pow(r,2));
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter radius: ");
        int radius=sc.nextInt();
        Sphere obj =new Sphere(radius);
    }
}