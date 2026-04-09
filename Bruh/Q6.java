    import java.util.*;
    public class Q6
    {
    	public static void main(String[] args) 
    	{
    		Scanner sc =new Scanner(System.in);
		System.out.println("Plz enter number:");
		int num = sc.nextInt();
		int rem=0, rev=0, result=0;
		while(num>0)      //run loop
		{
			rem=num%10;
			rev=rev*10;
			rev=rev+rem;
			num=num/10;
			result += rem; //Result
		}
		System.out.println("Sum of Digits: "+result); //Output
		System.out.println("Reverse of Number:"+rev);

	}
}