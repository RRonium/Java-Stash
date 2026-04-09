public class T11
{
    public static void main(String[] args) 
    {
        int i=1,c=i;
        for(i=1;i<=5;i++)
        {
            switch(i)               //use switch case for i because nested loop not allowed
            {
                case 1:
                    System.out.println(c);  //increase the value of c by 1 in each case
                    break;
                case 2:
                    System.out.println(c+" "+(c+1));
                    break;
                case 3:
                    System.out.println(c+" "+(c+1)+" "+(c+2));
                    break;
                case 4:
                    System.out.println(c+" "+(c+1)+" "+(c+2)+" "+(c+3));
                    break;
                case 5:
                    System.out.println(c+" "+(c+1)+" "+(c+2)+" "+(c+3)+" "+(c+4));
                    break;
                default:
                    System.out.println("Invalid");
            }
            
        }
        for(i=5;i>0;i--)
        {
            switch(i)               //use switch case for i because nested loop not allowed
            {
                case 5:
                    System.out.println("*"+"*"+"*"+"*"+"*");        //decrease no. of asterix displayed
                    break;
                case 4:
                    System.out.println(" "+"*"+"*"+"*"+"*");
                    break;
                case 3:
                    System.out.println(" "+" "+"*"+"*"+"*");
                    break;
                case 2:
                    System.out.println(" "+" "+" "+"*"+"*");
                    break;
                case 1:
                    System.out.println(" "+" "+" "+" "+"*");
                    break;
            }
        }
        for(i=0;i<=5;i++)
        {
            switch(i)                   //use switch case for i because nested loop not allowed
            {
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("1"+"0");        //increase frequency of the pattern of no.
                    break;
                case 3:
                    System.out.println("1"+"0"+"1");
                    break;
                case 4:
                    System.out.println("1"+"0"+"1"+"0");
                    break;
                case 5:
                    System.out.println("1"+"0"+"1"+"0"+"1");
                    break;
            }
        }

    }
}