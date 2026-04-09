import java.util.*;
public class Composite
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number pls: ");
        int num = sc.nextInt(),flag=0;
        
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                flag++;
            }
            
        }
        if(flag>2)
        {
            System.out.println("Not composite");
        }
        else
        {
            System.out.println("Composite");
        }
    }
}