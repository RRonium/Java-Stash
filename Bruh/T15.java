import java.util.*;
public class T15
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int a=0, b=1, c= 2, d=0, i,ch;
        System.out.println("Enter 1 for pattern 1 and 2 for pattern 2");
        ch = sc.nextInt();
        switch(ch)              //switch case for user choice
        {
            case 1:                         //Pattern for the first program
            System.out.print("0, "+"1, "+"2");
            for(i=4;i<=5;i++)
            {
                d=a+b+c;
                System.out.print(", " + d);
                a=b;
                b=c;
                c=d;
            }
            break;

            case 2:             //pattern for the second program
            i=-1;
            for(c=0;c<20;c++)
            {
                if(c%2==0)
                {

                }                
                else
                {
                    i++;
                    if(i%2==0)
                    {
                        System.out.print(c+", ");
                    }
                    else
                    {
                        System.out.print("-"+c+", ");
                    }

                }
            }
        } 

    }
}
 