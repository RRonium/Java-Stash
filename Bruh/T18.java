import java.util.*;
public class T18
{
    public static void main(String[] args)
    {
        int n1, n2, hcf = 1;
        int min, max;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1:");
        n1 = sc.nextInt();          //Accept the variables
        System.out.print("Enter num2:");
        n2 = sc.nextInt();
        
        min = n1;
        if (min > n2)               //check the condition
        {
            min = n2;
            max = n1;
        }
        else
        {
            min = n1;           //check the condtion
            max = n2;
        }
        while (max > min)               //Define the loop
        {
            int r = max % min;
            if (r == 0)             //check the condition
            {
                hcf = min;
                break;
            }
            else
            {
                max = min;
                min = r;
            }
        }
        if (hcf == 1)               //check the conndition
        {
            System.out.println("Co Prime Numbers");
        }
        else
        {
            System.out.println("Not Co Prime Numbers");
        }
    }
}