import java.util.*;
class T9
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        String nm;
        double sum,prem,d,c;
        System.out.println("Enter your name please: ");
        nm = sc.next();
        System.out.println("Enter the amount to be deposited please: ");
        sum = sc.nextDouble();
        System.out.println("Enter the premium please: ");
        prem = sc.nextDouble();

        if(sum<=100000)                 //slab 1
        {
            d = (prem*5)/100;
            System.out.println("Discount on the first premium is: "+d);     //Calculation of discount
            c = (sum*2)/100;
            System.out.println("Commission of the agent is: "+c);
        }
        else if(sum>100000 && sum<=200000)              //slab 2
        {
            d = (prem*8)/100;
            System.out.println("Discount on the first premium is: "+d);
            c = (sum*3)/100;
            System.out.println("Commission of the agent is: "+c);          //Calculation of commission
        }
        else if(sum>200000 && sum<=500000) //slab3
        {
            d = (prem*10)/100;
            System.out.println("Discount on the first premium is: "+d);
            c = (sum*5)/100;
            System.out.println("Commission of the agent is: "+c);
        }
        else if(sum>500000) //slab4
        {
            d = (prem*15)/100;
            System.out.println("Discount on the first premium is: "+d);
            c = (sum*7.5)/100;
            System.out.println("Commission of the agent is: "+c);
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}
 