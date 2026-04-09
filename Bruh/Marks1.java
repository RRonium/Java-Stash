import java.util.*;
public class Marks1
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int marks; 
		marks = sc.nextInt();
		if(marks>=90)
		{
			System.out.println("Your grade is A");
		}
		else if(marks<90 && marks>=70)
		{
			System.out.println("Your grade is B");
		}
		else if(marks<70 && marks>=50)
		{
			System.out.println("Your grade is C");
		}
		else if(marks<50 && marks>=35)
		{
			System.out.println("Your grade is D");
		}
		else if(marks<35)
		{
			System.out.println("Your grade is E");
		}
		else
		{
			System.out.println("Invalid");
		}
	}
}