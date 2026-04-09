import java.util.*;
class Q12
{
	int r, num2, c=0;
	public int two(int num2)  //check for divisibility by 2
	{
		this.num2 = num2;
		r = num2%10;
		if(r==0||r==2||r==4||r==6||r==8)
		{
			System.out.println("Number is divisiible by 2");
		}
		else
		{
			System.out.println("Number is not divisiible by 2");	
		}
		return r;	
	}
	public int four(int num2)     //check for divisibility by 4
	{
		this.num2 = num2;
		while(c<=2)
		{
			r = num2%100;
			c++;
		}
			if(r%4==0)
			{
				System.out.println("Number is divisiible by 4");
			}
			else
			{	
				System.out.println("Number is not divisiible by 4");	
			}
		return r;
	}
	public int five(int num2)          //check for divisibility by 5
	{
		this.num2 = num2;
		r = num2%10;
		if(r==0||r==5)
		{
			System.out.println("Number is divisiible by 5");
		}
		else
		{
			System.out.println("Number is not divisible by 5");	
		}
		return r;
	}
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int num;
		System.out.println("Please enter a number:");
		num = sc.nextInt();
		Q12 Obj =new Q12();
		System.out.println(Obj.two(num));
		System.out.println(Obj.four(num));
		System.out.println(Obj.five(num));
	}
	
}