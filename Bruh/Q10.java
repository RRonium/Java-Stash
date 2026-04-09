import java.util.*;
public class Q10
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		double p=0, b=0, h=0;
		System.out.println("Plz enter perpendicular, base, height:"); //Accepting values
		p = sc.nextDouble();
		b = sc.nextDouble();
		h = sc.nextDouble();
		if(Math.pow(p,2)  + Math.pow(b,2) == Math.pow(h,2)) //Apply Pythagoras theorem
		{
			System.out.println("Triangle is right-angled");      //outputs
		}
		else
		{
			System.out.println("Triangle is not right-angled");	
		}
	}
}