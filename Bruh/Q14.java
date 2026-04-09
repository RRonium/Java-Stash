import java.util.*;
public class Q14
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		double x1, x2, y1, y2, d;   //defining variables
		System.out.println("Please enter x1, x2, y1, y2 coordinates:");
		x1 = sc.nextDouble();   //Accepting values
		x2 = sc.nextDouble();
		y1 = sc.nextDouble();
		y2 = sc.nextDouble();
		d = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));  //Applying distance formula
		System.out.println("Answer is: "+d);
	}
}