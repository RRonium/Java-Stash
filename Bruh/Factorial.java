import java.util.*;
public class Factorial
{
    public double fact(int n)       //method for finding the factorial of the number
    {
        double f = 1;
        for (int i = 1; i <= n; i++)        //loop for the factorial
        {
            f *= i;
        }
        return f;                   //returning the required value
    }
    public static void main(String args[]) 
    {        
        Scanner sc = new Scanner(System.in);
        Factorial obj = new Factorial();       
        System.out.print("Please enter m: ");       //accepting the variables
        int m = sc.nextInt();
        System.out.print("Please enter n: ");
        int n = sc.nextInt();
        
        double s = (double)(obj.fact(n)) / (obj.fact(m) * obj.fact(n - m));     //formula in Java for the given expression in the question
        System.out.println("S=" + s);
    }
}