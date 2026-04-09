import java.util.*;
class NegativeNumberException extends Exception
{
}
class Age
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number pls: ");
        int num=sc.nextInt();
        try 
        {
           if(num<0)
           {
               throw new NegativeNumberException();
           }          
        }          
        catch (NegativeNumberException e)
        {
            System.out.println("Negative number not allowed");
        }
    }
}