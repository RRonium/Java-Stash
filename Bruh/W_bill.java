import java.util.*;
class W_bill
{
    String nm;
    int l;
    double bill;
    W_bill()
    {
        nm="";
        l=0;
        bill=0.0;
    }
    void accept()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter name pls: ");
        nm=sc.nextLine();
        System.out.println("Enter amount of water consumed in litres");
        l=sc.nextInt();
    }
    void tax()
    {
        if(l<=100)
        {
            bill+=(20*l);
        }
        else if(l>100 && l<=300)
        {
            bill+=(20*100) + (l-100)*30;
        }
        else if(l>300)
        {
            bill+=(20*100) + (30*200) + (l-300)*50 + 100;
        }
        else
        {
            System.out.println("Invalid");
        }
    }
    void print()
    {
        System.out.println("Name: "+nm);
        System.out.println("Water consumed(in litres): "+l);
        System.out.println("Tax Bill(in Rs.): "+bill);
    }
    public static void main(String args[])
    {      
        W_bill obj =new W_bill();
        obj.accept();
        obj.tax();
        obj.print();
    }
}