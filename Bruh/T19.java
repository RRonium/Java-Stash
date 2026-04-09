import java.util.*;
class T19
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int i,x,res=0,c,ch;
        System.out.println("Enter 1 for exponential pattern, 2 for loop pattern: ");
        ch = sc.nextInt();
        switch(ch)      //check the user-defined choice
        {
            
            case 1:
                System.out.println("Enter a number: ");             //pattern 1
                x=sc.nextInt();
                for(i=1;i<=20;i++)
                {
                    if(i%2==0)
                    {
                        res+=Math.pow(x,i)*-1;
                    }
                    else
                    {
                        res+=Math.pow(x,i);
                    }
                }   
                System.out.println("S="+res);
                break;
            
            
            case 2:                     //pattern 2
                for(i=1;i<=5;i++)
                {
                    for(c=1;c<=i;c++)
                    {
                        System.out.print("1");
                    }
                    System.out.print("   ");
                }
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
 