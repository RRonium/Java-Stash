import java.util.*;
public class SeriesQ17
{
    double sum=0;
    void series(double n)               //method for series 1
    {
        for(double i=1;i<=n;i++)        //loop for the exection of the first pattern
        {
            sum+=(1/i);
        }
        System.out.println(sum);
    }
    void series(double a,double n)          //method for series 2
    {
        int c=-1;
        for(double i=1;i<=n;i++)            //loop for the exection of the second pattern
        {
            c+=3;
            sum+=1/Math.pow(a,c);
        }
        System.out.println(sum);
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        SeriesQ17 obj =new SeriesQ17();
        System.out.println("Enter 1 for pattern 1 or 2 for pattern 2: ");
        int ch=sc.nextInt();
        double n,a;
        switch(ch)
        {
            case 1:                                                         //for choice 1
                System.out.println("Enter a number please: ");
                n=sc.nextInt();
                obj.series(n);
                break;
                
            case 2:                                                         //for choice 2
                System.out.println("Enter a number please: ");
                n=sc.nextInt(); 
                System.out.println("Enter another number please: ");
                a=sc.nextInt();
                obj.series(a,n);
                break;
            default:
                System.out.println("INVALID choice");
                break;
        }
    }
}
