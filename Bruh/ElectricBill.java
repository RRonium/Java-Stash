import java.util.*;
class ElectricBill
{
    String n;
    int units;
    double bill=0;
    void accept()
    {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enetr your name plz: ");
        n = sc.nextLine();
        System.out.println("Enter no. of units consumed: ");
        units = sc.nextInt();
    }
    void calculate()
    {
        if(units<=100)
        {
            bill=units*2;
            System.out.println("Bill: Rs. "+bill);
        }
        else if(units>100 && units<=300)
        {
            bill=(units-200)*2 + (units-100)*3;
            System.out.println("Bill: Rs. "+bill);
        }
        else if(units>300)
        {
            bill=(units-200)*2 + (units-100)*3 + (units-300)*5;
            System.out.println("Bill: Rs. "+bill);
        }
        else
        {
            System.out.println("INVALID");
        }
    }
    public static void main(String[] args) 
    {
        ElectricBill obj =new ElectricBill();
        obj.accept();
        obj.calculate();
    }
}