import java.util.*;
public class T8
{
  public static void main(String[] args) 
  {
    Scanner sc =new Scanner(System.in);
    int n1 = 0, n2 = 1, n3,ch,num, i, rem, rev, res=0, a=0, b=1, c= 2, d=0;
    System.out.println("1 for fibonacci series, 2 for sum of digits, 3  for tribonacci series:");
    ch = sc.nextInt();
    switch(ch)
    {
      case 1:
      System.out.println("Fibonacci Series till 10 terms:");            //program for fibonacci series
      for (i = 1; i <= 10; ++i) 
      {
        System.out.print(n1 + ", ");

        
        n3= n1 + n2;
        n1= n2;
        n2 = n3;
      }
      break;

      case 2:                                           //Sum of digits
      System.out.println("Enter no. plz");
      num = sc.nextInt();                   
      while(num>0)
      {
        res+=num%10;
        num/=10;
      }
      System.out.println("Sum of digits is: "+res);
      break;

      case 3:                                                   //Tribonacci series
      System.out.print("0, "+"1, "+"2");
      for(i=4;i<=10;i++)
      {
        d=a+b+c;
        System.out.print(", " + d);
        a=b;
        b=c;
        c=d;
      }
      break;
      default:                                  //invali statement
        System.out.println("Invalid");
        break;
    }
  }
}