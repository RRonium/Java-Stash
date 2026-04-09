import java.util.*;
class Q9
{
	int var1;
	public int word(int var1)  //Parameter variable
	{
		switch(var1)    //switch sae for choice
		{
			case 1:
				System.out.println("ONE");
				break;
			case 2:
				System.out.println("TWO");
				break;
			case 3:
				System.out.println("THREE");
				break;
			case 4:
				System.out.println("FOUR");
				break;
			case 5:
				System.out.println("FIVE");
				break;
			case 6:
				System.out.println("SIX");
				break;
			case 7:
				System.out.println("SEVEN");
				break;
			case 8:
				System.out.println("EIGHT");
				break;
			case 9:
				System.out.println("NINE");
				break;
			case 10:
				System.out.println("TEN");
				break;
			default:
				System.out.println("INVALID");
		}
		return var1;
	}
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter any number from 0-10:");
		int var2 = sc.nextInt();                //creating and invoking the object
		Q9 Obj =new Q9();
		System.out.println(Obj.word(var2));
	}
}