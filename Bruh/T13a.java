import java.util.*;
class T13a
{
    public static double calc(double num)
    {
        double res = 0, f = 1;
        for (int i = 1; i <= num; i++)      //Define a for loop to run 'num' number of times
        {
            f *= i;
            res +=(i / f);                     //depositing the value in 'res'
        }
        return res;
    }
 
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        double n = sc.nextInt();                //accepting the value of num
        System.out.println("Sum: " + calc(n));  //Calling of the method
    }
}
 