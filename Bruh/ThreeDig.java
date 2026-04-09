import java.util.*;
public class ThreeDig
{

  public static void main(String[] args) 
 {
 	Scanner sc =new Scanner(System.in);
    int c = 0;
    int num;
    num =sc.nextInt();
    while (num != 0) 
    {
      num /= 10;
      ++c;
    }
    if(c==3)
    {
    	System.out.println("Number has 3 digits");
    }
    else
    {
    	System.out.println("Number doesn't have 3 digits");
    }
  }
}