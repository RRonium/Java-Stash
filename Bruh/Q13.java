import java.util.*;
public class Q13
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		double num;
		System.out.println("Please enter a number:");
		num = sc.nextDouble();
		System.out.println("Square: " + Math.pow(num,2));    //squaring
		System.out.println("Cube: " + Math.pow(num,3));       //cubing
		System.out.println("Square root: " + Math.sqrt(num));     //square rooting
		System.out.println("Cube root: " + Math.cbrt(num));       //cube rooting
		System.out.println("Absolute value: " + Math.abs(num));   //Absolute
		System.out.println("Ceiling value: " + Math.ceil(num));   //Ceiling value
		System.out.println("Floor value: " + Math.floor(num));    //Floor value
	}
}