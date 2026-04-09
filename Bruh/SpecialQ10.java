import java.util.*;
public class SpecialQ10
{
  public static void main(String args[])
  {
      Scanner sc =new Scanner(System.in);
      System.out.println("Please enter a number: ");    
      int num =sc.nextInt();                    //accepting the value
      int n = num,rem=0,sum=0,pro=1;
      while(n>0)                //running a while loop to obtain the sum and product of digits
      {
          rem=n%10;
          sum+=rem;                     //Depositing the remainder in the variables
          pro*=rem;
          n/=10;
      }
      if(num==sum+pro)                      //to check the condition specified in the question
      {
          System.out.println("The number is a special number");             //display the statements
      }
      else if(num!=sum+pro)
      {
          System.out.println("The number is not a special number");
      }
      else
      {
          System.out.println("INVALID");
      }
  }
}
