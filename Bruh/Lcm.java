import java.util.*;
public class Lcm
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Plz enter two numbers consecutively:");
		int n1, n2, result;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		result=(n1>n2)?n1:n2;               //Ternary Operator checks the condition, which number is greater
		while(true)	
		{
			if(result%n1==0 && result%n2==0)
			{
				System.out.println("LCM of "+n1+" and "+n2+" is: "+result);
				break;
				//On getting LCM we break the loop
			}
			++result;    //Increment result by 1 until if block is true
		}
	}
}