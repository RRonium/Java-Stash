import java.util.*;
public class Hcf {
   public static void main(String args[])
   {
      int n1, n2, c, hcf = 0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Plz enter two numbers consecutively: ");
      n1 = sc.nextInt();
      n2 = sc.nextInt();
      for(c = 1; c <= n1 || c <= n2; c++)
      {
         if( n1%c == 0 && n2%c == 0 )
         {
             hcf = c;
         }
    }
      System.out.println("HCF of given two numbers is :"+hcf);
   }
}