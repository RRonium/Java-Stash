import java.util.*;
public class T5
{
	public static void main(String[] args) 
	{
		char ch;
		int p=0, dist, fare=0, tfare=0;
		Scanner sc =new Scanner(System.in);
		while(p!=999)
		{
			System.out.println("Would you like to take the bus ride? (Y/N)");
			ch = sc.next().charAt(0);
			if(ch == 'y' || ch=='Y')
			{
				p++;
				System.out.println("How far in km? :");
				dist = sc.nextInt();
				if(dist<=5)
				{
					fare=80;
				}
				else if(dist>5 && dist <=15)
				{
					fare = 80 + 10*(dist-5);
				}
				else if(dist>15)
				{
					fare = 80 + 10*(dist-5) + 8*(dist-15);
				}
				System.out.println("Passengers: " + p);
				System.out.println("Fare: " + fare);
				tfare+=fare;
			}
			else if(ch == 'n' || ch=='N')
			{
				System.out.println("Ok bye");
				break;
			}
			else
			{
				System.out.println("invalid");	
				break;
			}
			System.out.println("Total fare recieved: "+tfare);	
		}
	}
}