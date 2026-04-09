import java.util.*;
public class Discount2
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		float price, dis, amount; 
		price = sc.nextFloat();
		if(price<2000)
		{
			dis = 5;
			amount = price - price*(dis/100);
			System.out.println("Discount " + dis);
			System.out.println("You have to pay "+amount);
		}
		else if(price>2000 && price<=5000)
		{
			dis = 25;
			amount = price - price*(dis/100);
			System.out.println("Discount " + dis);
			System.out.println("You have to pay "+amount);
		}
		else if(price>5000 && price<=10000)
		{
			dis = 35;
			amount = price - price*(dis/100);
			System.out.println("Discount " + dis);
			System.out.println("You have to pay "+amount);
		}
		else if(price>10000)
		{
			dis = 50;
			amount = price - price*(dis/100);
			System.out.println("Discount " + dis);
			System.out.println("You have to pay "+amount);
		}
		else
		{
			System.out.println("Invalid");
		}
	}
}