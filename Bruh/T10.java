import java.util.*;
class T10
{
    public static void main(String[] args)
    {
        double p,t, i;
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter principle amount: ");
        p = sc.nextDouble();
        System.out.println("Please enter the time for which would like to deposit the money(in days): ");
        t = sc.nextDouble();

        if(t<=180)  //slab 1
        {
            i = (p*t/365*5.5)/100;
            System.out.println("Interest will be: "+i);             //calculate the interest
            System.out.println("Amount to be paid will be "+(p+i));
        }
        else if(t>180 && t<=364)            //slab2
        {
            i = (p*t/365*7.5)/100;
            System.out.println("Interest will be: "+i);
            System.out.println("Amount to be paid will be "+(p+i));         //calculate the amount
        }
        else if(t==365)             //slab3
        {
            i = (p*t/365*9)/100;
            System.out.println("Interest will be: "+i);
            System.out.println("Amount to be paid will be "+(p+i));
        }
        else if(t>365)          //slab4
        {
            i = (p*t/365*8.5)/100;
            System.out.println("Interest will be: "+i);
            System.out.println("Amount to be paid will be "+(p+i));
        }
        else
        {
            System.out.println("Duration too short or invalid");
        }
    }
}
 