;import java.util.*;  
public class Calculate
{
    int num,f,rev;
    Calculate(int n)            //Constructor for variable initialization
    {
        num=n;
        f=0;
        rev=0;
    }
    int prime()             //method 1 for the checking if the number is a prime number or not
    {
        f = 1;
        if (num == 0 || num == 1)
            f = 0;
        else
            for (int i = 2; i <= num / 2; i++)          //loop for the factor checking
            {
                if (num % i == 0) 
                {
                    f = 0;
                    break;
                }
            }
        
        if(f==0)
        {
            System.out.println("No. is not a prime no.");
        }
        else
        {
            System.out.println("No. is a prime no.");
        }
        return f;
    }
    int reverse()       //method 2 to get the reverse of the entered number
    {
        int temp = num;
        while(temp!=0)      //loop for the reverse
        {
            rev*=10;
            rev+=temp%10;
            temp/=10;
        }
        System.out.println("The reversed number is: "+rev);
        return rev;
    }
    void display()          //method 3 to display the given value
    {
        if(num==rev && f==1)
        {
            System.out.println("The number is a prime palidrome");
        }
        else
        {
            System.out.println("The number is not a prime palindrome");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        Calculate obj =new Calculate(n);
        obj.prime();
        obj.reverse();
        obj.display();
    }
}
