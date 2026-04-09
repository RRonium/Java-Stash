import java.util.*;
public class T14
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to display all prime numbers");
        System.out.println("Enter 2 to display all non-prime numbers");
        System.out.println("Enter your choice: ");
        int ch = sc.nextInt();
        int i,j;
        boolean pr;
        switch (ch) //Define switch case for execution of programs based on user's choice
        {
            case 1:
            for (i = 2; i <= 100; i++) //Outer for loop
            {
                pr = true;
                for (j = 2; j <= i / 2; j++) //Inner for loop
                {
                    if (i % j == 0) //Prime no. check
                    {
                        pr = false;
                        break;
                    }
                }
                if (pr==true)
                { 
                    System.out.println(i);
                }
            }
            break;
            
            case 2:
            for (i = 2; i <= 100; i++) //Outer loop
            {
                pr = true;
                for (j = 2; j <= i / 2; j++) //Inner loop
                {
                    if (i % j == 0) //Prime no. check
                    {
                        pr = false;
                        break;
                    }
                }
                if (pr==false) 
                    System.out.println(i);
            }
            break;
            
            default:
            System.out.println("Invalid");
            break;
        }
    }
}