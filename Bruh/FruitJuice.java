import java.util.*;
class FruitJuice
{
    int product_code, pack_size, product_price;
    String flavour, pack_type;
    FruitJuice()                //Constructor for the initialization of the variables declared
    {
        product_code = 0;
        pack_size = 0;
        product_price = 0;
        flavour = "";
        pack_type = "";
    }
    void input()                    //method specialized for accepting the required values from the user
    {
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter the product code: ");
        product_code = sc.nextInt();

        System.out.println("Enter the pack size (in ml): ");
        pack_size = sc.nextInt();

        System.out.println("Enter the product price: ");
        product_price = sc.nextInt();

        System.out.println("Enter the flavour: ");
        flavour = sc.next();

        System.out.println("Enter the pack_type: ");
        pack_type = sc.next();
    }
    void discount()         //Calculation of the discount
    {
        product_price-=10;
    }
    void display()              //display method
    {
        System.out.println("Product code: "+product_code);
        System.out.println("Pack_size: "+pack_size);
        System.out.println("Product price: "+product_price);
        System.out.println("Flavour: "+flavour);
        System.out.println("Pack type: "+pack_type);

    }
    public static void main(String[] args)                  
    {
        FruitJuice obj =new FruitJuice();
        obj.input();                            //method calling
        obj.discount();
        obj.display();
    }
}