import java.util.*;
public class loop1
{
	public static void main()
{
	Scanner num = new Scanner(System.in);
	int a= num.nextInt();
	if(a<=2)
	{
	for(int i=a; i<=5; i++)
	{
		System.out.println("The value of i is : " + i);
	}
	}
	else
	{
		System.out.println("Invalid");
	}
}
}