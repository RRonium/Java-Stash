import java.util.*;
class T13b
{
    public static double calc(double num, double a)     //Defining ,ethod for calculation
    {
        double res = 0, f = 1;
        for (int i = 1; i <= num; i++)      //defining the loop to run num number of times
        {
            f *= i;                         //updating the value of f with each iteration
            res +=Math.pow(a,(i / f));      //Storin the result in res
        }
        return res;
    }
 
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter no.: ");
        double a = sc.nextInt();                    //Accepting the values from the user
        System.out.println("Enter Limit: ");
        double n = sc.nextInt();
        System.out.println("Sum: " + calc(n,a));        //calling the method
    }
}
 