import java.util.*;
public class Q2
{
	public static void main(String[] args) {
		int price;
		int amount;
		Scanner sc =new Scanner(System.in);
		System.out.println("Plz enter price");
		price = sc.nextInt();
		if(price<=1000)
		{
			amount = price - (10/100*price);
			System.out.println("Your amount to pay is:" + amount);
		}
		else if(price>1000 && price<=3000)
		{
			amount = price - (15/100*price);
			System.out.println("Your amount to pay is:" + amount);
		}
		else if(price>3000)
		{
			amount = price - (20/100*price);
			System.out.println("Your amount to pay is:" + amount);
		}
		else
		{
			System.out.println("Invalid");
		}
	}
}