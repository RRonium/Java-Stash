import java.util.*;
public class T17
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        int ch;
        System.out.println("Enter 1 for angstrom no., 2 for palindrone: ");
        ch = sc.nextInt();
        if(ch==1)           //check the condition for user defined choice
        {
            int num, rem, result = 0, userval=0;
            System.out.println("Enter a number:");
            num=sc.nextInt();
            userval = num;
            while (num != 0)    //define the loop to individually
            {
                rem = num % 10;
                result += Math.pow(rem, 3);
                num /= 10;
            }

            if(result == userval)           //check the reulst with the user defined no.
                System.out.println(userval + " is an Armstrong number.");
            else
                System.out.println(userval+ " is not an Armstrong number.");
        }
        else if(ch==2)          //for palindrome program
        {
            int r,sum=0,temp;    
            System.out.println("Enter a number");
            int n=sc.nextInt();//It is the number variable to be checked for palindrome  
  
            temp=n;    
            while(n>0)                  //run the required loop
            {    
            r=n%10;  //getting remainder  
            sum=(sum*10)+r;    
            n=n/10;    
            }
            
        if(temp==sum)               
            System.out.println("palindrome number ");    
        else    
            System.out.println("not palindrome");    
        }  
  
    }
    

}