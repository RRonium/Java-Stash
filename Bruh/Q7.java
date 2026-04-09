import java.util.*;
public class Q7
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Plz enter number:");
		int num = sc.nextInt();       //Accept value from user
		int r=0;
		while(r<=100)     //loop will run till r is 100
		{
			r = num*++num;       //increment of r
			System.out.println("Product is: "+r);
		}
	}
}