import java.util.*;
public class Hehe
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size of array pls ");
        int n =sc.nextInt();
        System.out.println("Roll no. pls: ");
        int roll[] =new int[n];
        for(int i=0;i<n;i++)
        {
            roll[i]=sc.nextInt();
        }
        
        System.out.println("Enter String name pls: ");
        String name[] =new String[n]; 
        for(int i=0;i<n;i++)
        {
            name[i]=sc.next();
        }
        System.out.println("Enter marks for PCM: ");
        int phy[] =new int[n];
        int chem[] =new int[n];
        int maths[] =new int[n];
        for(int i=0;i<n;i++)
        {
            phy[i]=sc.nextInt();
            chem[i]=sc.nextInt();
            maths[i]=sc.nextInt();
        }
        System.out.println("Merit according to ur average: ");
        for(int i=0;i<n;i++)
        {
            double avg = (phy[i]+chem[i]+maths[i])/3;
            if(avg<40)
            {
                System.out.println("POOR");
            }
            else if(avg>=40 && avg<60)
            {
                System.out.println("PASS");
            }
            else if(avg>=60 && avg<75)
            {
                System.out.println("FIRST CLASS");
            }
            else if(avg>=75 && avg<85)
            {
                System.out.println("DISTINCTION");
            }
            else if(avg>=85 && avg<=100)
            {
                System.out.println("EXCELLENT");
            }
            else
            {
                System.out.println("INVALID");
            }
        }
    }
}