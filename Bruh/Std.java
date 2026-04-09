import java.util.*;
public class Std
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        String cities[] =new String[10];
        int std[] =new int[10];
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter the city name: ");
            cities[i]=sc.next();
            System.out.println("Enter the std: ");
            std[i]=sc.nextInt();
        }
        int sk = sc.nextInt();
        for(int i=0;i<10;i++)
        {
            if(std[i]==sk)
            {
                System.out.println("city: "+cities[i]);
                System.exit(0);
            }
            
        }
        System.out.println("city not found");
    }
}
