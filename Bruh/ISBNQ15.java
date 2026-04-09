import java.util.*;
public class ISBNQ15
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the 10-digit ISBN: ");
        long isbn = sc.nextLong();
        long n = isbn,flag=0, res=0;
        while(n>0)              //while loop for counting the number of digits
        {
            n/=10;
            flag++;
        }
        if(flag!=10)
        {
            System.out.println("Illegal ISBN");
            System.exit(0);                                 //termination of the program if the digits are less than 10
        }
        n=isbn;                     //reinitializing variables
        flag=0;
        while(n>0)                  //loop for getting the number whose divisibility we must check
        {
            flag++;
            res+=(n%10)*(flag);
            n/=10;
        }
        if(res%11==0)               //checking the divisibilty of 11
        {
            System.out.println("Legal ISBN");
        }
        else
        {
            System.out.println("Illegal ISBN");
        }
    }
}
