import java.util.*;   
public class T20 
{  
   public static boolean check(int num) {  
  
      // use loop to repeat steps  
      while(num != 0) {  
  
         // check whether the last digit of the number is zero or not  
         if(num%10 == 0)  
            return true;    //return true if the number is Duck  
  
         // divide the number by 10 to remove the last digit  
         num/=10;  
      }  
  
      return false; //return false if the number is not Duck  
   }  
   public static void main(String args[])   
   {     
       int n1, n2;  
       Scanner sc=new Scanner(System.in);          
       System.out.println("Enter first number");           
       n1 = sc.nextInt();            
       System.out.println("Enter second number");           
       n2 = sc.nextInt();           
        if (check(n1))   
            System.out.println(n1 + " is a Duck number");   
        else  
            System.out.println(n1 + " is not a Duck number");   
        if (check(n2))   
            System.out.println(n2 + " is a Duck number");   
        else  
            System.out.println(n2 + " is not a Duck number");   
    }  
}  