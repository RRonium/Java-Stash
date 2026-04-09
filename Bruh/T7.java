import java.util.*;
public class T7
{
    public static void main(String[] args) 
    {
        char ch1;
        int ch2;
        double floor, cap=500, tsh=800, berm=1000, bill=0, top=1000, sk=2000, dress=1500, fs=1500, trou=1200, ct=1000, lc=6000, ks=10000, ban=3000 ;
        Scanner sc =new Scanner(System.in);
        System.out.println("Use Elevator?:(Y/N)");
        ch1 = sc.next().charAt(0);
        while(ch1=='y'||ch1=='Y')
        {
            System.out.println("Welcome to MegaShop!, Plz enter the floor no.:");
                    System.out.println("0 for Kids wear ");
            System.out.println("1 for Ladies wear ");                    //Display choices for types of merchandise
            System.out.println("2 for Designer Sarees ");
            System.out.println("3 for Men's wear ");
            floor = sc.nextDouble();
            if(floor==0)
            {           
                System.out.println("Want to shop in kids wear?(Y/N):");
                ch1 = sc.next().charAt(0);
                while(ch1=='y' || ch1== 'Y')
                {
                    System.out.println("Items: 1.Cap:-Rs.500        2.T-shirt:- Rs.800       3.Bermuda Pants:-Rs.1000");
                    System.out.println("Type the serial no. for choice: ");
                    ch2 = sc.nextInt();
                
                    switch(ch2)
                    {
                        case 1:
                            bill+=cap;
                            break;
                        case 2:
                            bill+=tsh;          //add prices of merchandise selected by user to bill
                            break;
                        case 3:
                            bill+=berm;
                            break;
                        default:
                            System.out.println("invalid");
                            break;
                    }
                    System.out.println(bill);
                    System.out.println("exit floor?:(Y/N)");
                    ch1 = sc.next().charAt(0);
                    if(ch1=='y' || ch1 == 'Y')
                    {
                        break;
                    }

                }
            }
            else if(floor==1)
            {
                System.out.println("Want to shop in lady's wear?(Y/N):");
                ch1 = sc.next().charAt(0);
                while(ch1=='y' || ch1== 'Y')
                {
                    System.out.println("Items: 1.Tops:-Rs.1000        2.Dresses:- Rs.1500       3.Salwar kameez:-Rs.2000");             //Display prices
                    System.out.println("Tpye the serial no. for choice: ");
                    ch2 = sc.nextInt();
                
                    switch(ch2)
                    {
                        case 1:
                            bill+=top;
                            break;
                        case 2:
                            bill+=dress;
                            break;
                        case 3:
                            bill+=sk;
                            break;
                        default:
                            System.out.println("invalid");
                            break;
                    }
                    System.out.println(bill);
                    System.out.println("exit floor?:(Y/N)");
                    ch1 = sc.next().charAt(0);
                    if(ch1=='y' || ch1 == 'Y')
                    {
                        break;
                    }
                    
                }
            }
            else if(floor==2)
            {
                System.out.println("Want to shop in Designer sarees wear?(Y/N):");
                ch1 = sc.next().charAt(0);
                while(ch1=='y' || ch1== 'Y')
                {
                    System.out.println("Items: 1.Lucknow Chikan:-Rs.6000        2.Katha stitch:- Rs.10000       3.Banarasi:-Rs.3000");
                    System.out.println("Type the serial no. for choice: ");
                    ch2 = sc.nextInt();
                
                    switch(ch2)
                    {
                        case 1:
                            bill+=lc;
                            break;
                        case 2:
                            bill+=ks;
                            break;
                        case 3:
                            bill+=ban;
                            break;
                        default:
                            System.out.println("invalid");
                            break;
                    }
                    System.out.println(bill);
                    System.out.println("exit floor?:(Y/N)");
                    ch1 = sc.next().charAt(0);
                    if(ch1=='y' || ch1 == 'Y')
                    {
                        break;
                    }
                }
            }
            else if(floor==3)
            {
                System.out.println("Want to shop in Men's wear?(Y/N):");
                ch1 = sc.next().charAt(0);
                while(ch1=='y' || ch1== 'Y')            //check the user's choice
                {
                    System.out.println("Items: 1.Formal Shirts:-Rs.1500        2.Trousers:- Rs.1200       3.Casual Tee:-Rs.1000");
                    System.out.println("Type the serial no. for choice: ");
                    ch2 = sc.nextInt();
                
                    switch(ch2)
                    {
                        case 1:
                            bill+=fs;
                            break;
                        case 2:
                            bill+=trou;         
                            break;
                        case 3:
                            bill+=ct;
                            break;
                        default:
                            System.out.println("invalid");
                            break;
                    }
                    System.out.println(bill);
                    System.out.println("exit floor?:(Y/N)");
                    ch1 = sc.next().charAt(0);
                    if(ch1=='y' || ch1 == 'Y')
                    {
                        break;
                    }
                    
                }
            }
        }
        System.out.println("Name of the Shop: City Mart");
        System.out.println("Total amount: "+bill);              //final output
        System.out.println("Visit again!!!");
    }
}