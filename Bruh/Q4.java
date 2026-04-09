import java.util.*;
public class Q4
{
	public static void main(String[] args) 
	{
		int n=3, i, term, count = 0;
		while(count<10) //loop to print 10 series
		{
			term=1;
			for(i=1;i<=n;i++)    
			{
				term*=2; //multiplying term by 2
			}
			term+=2;
			n++;
			if(term%5==0 && term>100)    //check divisibility with five
			break;
			if(term%3==0)        //check divisibility with three
			continue;
			System.out.println(term);
			count++;
		}
	}
}