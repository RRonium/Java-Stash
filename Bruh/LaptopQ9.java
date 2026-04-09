import java.util.*;
public class LaptopQ9
{
    Scanner sc =new Scanner(System.in);
    String name;
    double price;
    double discount;
    double amt;
    public LaptopQ9()               //declaration of the constructor
    {
        name = "";
        price = 0;
        discount = 0;
        amt = 0;
    }
    void accept()                   //method for accepting all the values
    {
        System.out.println("Please enter your name: ");
        name = sc.nextLine();
        System.out.println("Please enter price: ");
        price = sc.nextDouble();        
    }
    void compute()                  //method for computation 
    {
        if(price<=25000)
        {
            discount=price*5/100;            
        }
        else if(price>=25001 && price<=50000)
        {
            discount=price*7.5/100;
        }
        else if(price>=50001 && price<=100000)
        {
            discount=price*10/100;
        }
        else if(price<100000)
        {
            discount=price*15/100;
        }
        else
        {
            System.out.println("INVALID");
        }
        amt=price-discount;
    }
    void display()          //method for displaying
    {
        System.out.println("Dear "+name+",");
        System.out.println("Price os product: Rs."+price);
        System.out.println("Final bill amount: Rs."+amt);
    }
    public static void main(String args[])
    {
        LaptopQ9 obj =new LaptopQ9();
        obj.accept();                       //calling the methods
        obj.compute();       
        obj.display();        
    }
}
