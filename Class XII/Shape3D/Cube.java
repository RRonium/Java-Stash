package Shape3D;
import java.util.*;
class Cube extends Shape3D
{
    int s;
    Cube(int side)
    {
        s=side;
    }
    public void calculateVolume()
    {
        System.out.println("Volume is: "+Math.pow(s,3));
    }
    public void calculateSurfaceArea()
    {
        System.out.println("Surface area is: "+ 6*Math.pow(s,2));
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("l enter side length: ");
        int side=sc.nextInt();
        Cube obj =new Cube(side);
    }
}