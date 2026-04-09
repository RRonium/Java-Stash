import java.util.*;
public class Perfect
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter age pls: ");
        int age = sc.nextInt();
        System.out.println("1 for male 2 for female: ");
        int gender=sc.nextInt();
        if(age<=65 && gender==1)
        {
            double income = sc.nextDouble();
            double tax=0.0;
            if(income<=160000)
            {
                tax=0.0;
            }
            else if(income>160000 && income<=500000)
            {
                tax=(income-160000)*0.1;
            }
            else if(income>500000 && income<=800000)
            {
                tax=((income-500000)*0.2)-34000;
            }
            else if(income>800000)
            {
                tax=((income-800000)*0.3)+94000;
            }
            else
            {
                System.out.println("Invalid");
                System.exit(0);
            }
            System.out.println("Taxable income: "+income);
            System.out.println("Tax: "+tax);
            System.out.println("Total: "+(income+tax));
        }
        else
        {
            System.out.println("wrong category");
        }
    }
}