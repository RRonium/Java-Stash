import java.util.*;
public class T4b
{
	public static void main(String[] args) 
	{
		double i,c=0,j=1,res=0,n;
		Scanner sc =new Scanner(System.in);
		System.out.println("No. of times loop to execute:");
		n =sc.nextInt();

		for(i=0;i<=n;i++)
		{
			c+=2;
			j+=2;
			res += c/j;
		}
		System.out.println(res);
	}
}