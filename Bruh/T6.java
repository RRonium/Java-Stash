import java.util.*;
public class T6
{
	public static void main(String[] args) 
	{
		int i,c,ch;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 1 for triangle and 2 for inverted triangle: ");
		ch = sc.nextInt();
		if(ch==1)
		{
			for(i=0;i<=5;i++)
			{
				for(c=1;c<=i;c++)
				{
					System.out.print(i);
				}
				System.out.println();	
			}
		}
		else if(ch==2)
		{			
			for(i=5;i>=0;i--)
				{
					for(c=1;c<=i;c++)
					{
						System.out.print(i);
					}
					System.out.println();
				}
		}
		else
		{
			System.out.println("Invalid");
		}
	}
}