//Start from 1; every odd no. = x; every even no. = y;
import java.util.*;
class FiboString
{
    String x,y,z;
    int n;
    FiboString()
    {
        x="a";
        y="b";
        z="ba";
    }
    void accept()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter no. of term: ");
        n=sc.nextInt();        
    }
    void generate()
    {
        System.out.print(x+", "+y+", ");
        for(int i=3;i<=n;i++)
        {
            if(i%2!=0)
            {
                x=z;
                System.out.print(z+", ");
                z=x+y;
            }
            else if(i%2==0)
            {
                y=z;
                System.out.print(z+", ");
                z=y+x;
            }
        }
    }
    public static void main(String args[])
    {
        FiboString obj =new FiboString();
        obj.accept();
        obj.generate();
    }
}