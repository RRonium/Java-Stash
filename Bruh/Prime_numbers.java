import java.util.*;

public class Prime_numbers
{
	
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int i, c = 0; 
		double num; 
		sc = new Scanner(System.in);
		
		System.out.print(" Plz enter Number : ");
		num = sc.nextInt();		
		for (i = 2; i <= num/2; i++)          //Run for loop to check if number is divisible or if it has any factors
		{
		    if(num % i == 0)
		    {
			c++;
		        break;
		    }	
		}
		if(c == 0 && num != 1)        //Check if c=0 and num not = 1 through if block
		{
			System.out.println( num + " is a Prime Number");     //Output
		}
		else
		{
		   System.out.println(num + " is Not a Prime Number");        //Output
		}
	}
}