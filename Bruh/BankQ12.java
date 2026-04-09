import java.util.*;
public class BankQ12
{
   double a;
   void compound(double P, double r, double n)          //method for the first formula of choice
   {
       a = P*Math.pow((1+r/100),n);                         //Calculation of the formula for Amount with coumpound interest 
       System.out.println("The amount: "+a);
   }
   void recurr(double P, double r, double n)               //method for the second formula of choice
   {
       a = (P*n)+(P*n*(n+1)*r/2400);          //Calculation of the formula for the Amount with interest of recurring deposits
       System.out.println("The amount: "+a);
   }
   public static void main(String args[])
   {
       Scanner sc =new Scanner(System.in);
       BankQ12 obj =new BankQ12();
       System.out.println("Enter your choice 1 or 2: ");
       int ch=sc.nextInt();
       double P,r,n;
       switch(ch)                                       //switch...case for the choice of the user
       {
           case 1:
           System.out.println("Enter the principal amount: ");
           P = sc.nextDouble(); 
           System.out.println("Enter the rate: ");
           r = sc.nextDouble(); 
           System.out.println("Enter the time in years: ");
           n = sc.nextDouble(); 
           obj.compound(P,r,n);
           break;
           
           case 2:
           System.out.println("Enter the monthly installment: ");
           P = sc.nextDouble(); 
           System.out.println("Enter the rate: ");
           r = sc.nextDouble(); 
           System.out.println("Enter the time in months: ");
           n = sc.nextDouble(); 
           obj.recurr(P,r,n);
           break;
       }
   }
}
