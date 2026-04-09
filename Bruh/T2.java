import java.util.*;
public class T2
{
    public static void main(String[] args) 
    {
        int ch, oprice, fprice,dep;
        Scanner sc =new Scanner(System.in);
        System.out.println("For no. of years of usage, Plz enter 1 for one year, 2 for two years and so on.....");
        ch = sc.nextInt();
        System.out.println("Plz enter original price of the car:");
        oprice = sc.nextInt();
        switch(ch)                  //Finding which case is suitable for the user-defined choice
        {
            case 1:
                dep = oprice*10/100;
                fprice = oprice - dep;
                System.out.println("Depricated amount is: "+dep);               //display of calculated prices
                System.out.println("Final price: "+fprice);
                break;
            case 2:
                dep = oprice*20/100;
                fprice = oprice - dep;
                System.out.println("Depricated amount is: "+dep);
                System.out.println("Final price: "+fprice);
                break;
            case 3:
                dep = oprice*30/100;
                fprice = oprice - dep;
                System.out.println("Depricated amount is: "+dep);
                System.out.println("Final price: "+fprice);
                break;
            case 4:
                dep = oprice*50/100;
                fprice = oprice - dep;
                System.out.println("Depricated amount is: "+dep);
                System.out.println("Final price: "+fprice);
                break;
        }
        if(ch>4)            //for more than 4 years of usage
        {
                dep = oprice*60/100;
                fprice = oprice - dep;
                System.out.println("Depricated amount is: "+dep);
                System.out.println("Final price: "+fprice);
        }

        
    }
}