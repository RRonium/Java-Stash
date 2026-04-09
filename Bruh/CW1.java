import java.util.*;
class CW1 {
  public static void main(String[] args) 
  {
    Scanner sc =new Scanner(System.in);
    System.out.println("Price of article:");
    double price = sc.nextInt();
    System.out.println("Discount on article:");
    double d = sc.next().charAt(0);
    double netA = price-price*d/100;
    double gA = price;
    System.out.println("Price: " +price);
    System.out.println("Net amount: " +netA);
    System.out.println("Gross Amount: " +gA);
  }
}