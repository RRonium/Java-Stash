import java.util.*;   
import java.lang.Math;
public class Circle
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int choice;
		double r, area, peri;
		System.out.println("Hi, Please enter '1' for area and '2' for perimeter of the circle:");
		choice = sc.nextInt();
		if(choice==1)             //If block to check the choice selection
		{
			System.out.println("Plz enter radius:");
			r = sc.nextDouble();
			area = (22*r*r)/7;       //Calculation of area
			System.out.println("The area is: "+area);
		}
		else if(choice==2)
		{
			System.out.println("Plz enter radius:");
			r = sc.nextDouble();
			peri = (2*22*r)/7;       //Calculation of circumference
			System.out.println("The area is: "+peri);
		}
		else
		{
			System.out.println("Invalid input");
		}
	}
}