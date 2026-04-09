import java.util.*;
public class BookFair
{
    String Bname;
    double price;
    BookFair()
    {
        Bname = "";
        price = 0;
    }
    void input()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the book name: ");
        Bname = sc.next();
        System.out.println("Price: ");
        price = sc.nextDouble();

    }
    void calculate()
    {
        if(price<=1000)
        {
            price = price - (price*2/100);
            
        }
        else if(price>1000 && price<=3000)
        {
            price = price - (price*10/100);
            
        }
        else if(price>3000)
        {
            price = price - (price*15/100);
            
        }
        else
        {
            System.out.println("INVALID");
        }
    }
    void display()
    {
        System.out.println("Hello "+Bname+" your bill is: "+price);
    }
    public static void main(String[] args)
    {
        BookFair obj =new BookFair();
        obj.input();
        obj.calculate();
        obj.display();
    }
}
