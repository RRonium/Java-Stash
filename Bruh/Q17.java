import java.util.*;
public class Q17
{
	public static void main(String[] args) {
		String name;
		Scanner sc =new Scanner(System.in);
		double income, a;
		System.out.println("Plz enter name and income:");
		name = sc.next();  //Accepting variables
		income = sc.nextDouble();
		if(income<=110000)    //income tax calculation
		{
			System.out.println("Hi\n" + name + ", you do not have any income tax!");
		}
		else if(income>=110001 && income<=150000)
		{
			System.out.println("Hi\n" + name + "This is the income tax due: 20%");
			a = income - (income/10);
			System.out.println("income is is: "+a);
		}
		else if(income>=150001 && income<=250000)
		{
			System.out.println("Hi\n" + name + " This is the income tax due: 30%");
						a = income - (income/5);
									System.out.println("income is is: "+a);
		}
		else if(income>=250000)
		{
			System.out.println("Hi\n" + name + "This is the income tax due: 35%");
						a = income - (3*income/10);
									System.out.println("income is is: "+a);
		}
		
		else
		{
			System.out.println("Invalid");   //Error statement
		}
	}
}