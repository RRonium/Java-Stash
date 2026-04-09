import java.util.*;
public class HcfLcm
{
    int a;
    int b;
    public HcfLcm(int x, int y)             //declaration of a constructor
    {
        a = x;
        b = y;
    }
    public void calculate()                 //method for calculation
    {
        int x = a, y = b;
        while (y != 0)                      //finding the hcf
        {
            int t = y;
            y = x % y;
            x = t;
        }
        
        int hcf = x;
        int lcm = (a * b) / hcf;            //calculation for the lcm
        
        System.out.println("HCF = " + hcf);
        System.out.println("LCM = " + lcm);
    }
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter 1st number: ");              //accepting the values
        int x = sc.nextInt();
        System.out.print("Please enter 2nd number: ");
        int y = sc.nextInt();
        HcfLcm obj = new HcfLcm(x,y);
        obj.calculate();
    }
}