import java.util.*;
public class P3
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int a, i;
		System.out.println("Enter a val:");
		a = sc.nextInt();
		double s=0;
		for(i=1;i<=10;i++)
		{
			s+=(Math.pow(a,i)/i);
		}
		System.out.println(s);
	}
}