import java.util.*;   
import java.lang.Math;
public class Q8
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int choice;
		double r, vol, l, b, h;
		System.out.println("Hi, Please enter 1 for cube, 2 for sphere, 3 for cuboid:");
		choice = sc.nextInt();                //Accepting choice
		switch(choice)                                        
		{
		case 1:
			System.out.println("Plz enter side:");       //Calculation for volume of a cube
			l = sc.nextDouble();
			vol = Math.pow(l,3);
			System.out.println("The volume is: "+vol);
			break;
		case 2:
			System.out.println("Plz enter radius:");         //Calculation for volume of a sphere
			r = sc.nextDouble();
			vol = (22*4*Math.pow(r,3))/(7*3);
			System.out.println("The volume is: "+vol);
			break;
		case 3:
			System.out.println("Plz enter l:");             //Calculation for volume of a cuboid
			l = sc.nextDouble();
			System.out.println("Plz enter b:");
			b = sc.nextDouble();
			System.out.println("Plz enter h:");
			h = sc.nextDouble();
			vol = l*b*h;
			System.out.println("The volume is: "+vol);
			break;
		default:                                                  //Error statement
			System.out.println("Invalid");
		}
	}
}