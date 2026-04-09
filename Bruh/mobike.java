import java.util.*;
public class mobike
{
    int bno,days,charge=0;
    long phno;
    String name = "";
    void input()
    {
       Scanner sc =new Scanner(System.in);
       System.out.println("Input details pls: ");
       System.out.println("Bike no. : ");
       bno=sc.nextInt();
       System.out.println("Phone no. : ");
       phno = sc.nextLong();
       System.out.println("Name: ");
       name = sc.next();
       System.out.println("No. of days on rent: ");
       days=sc.nextInt();
    }
    void compute()
    {
        if(days<=5)
        {
            charge+=500*days;
        }
        else if(days>5 && days<=10)
        {
            charge+=500*5 + 400*(days-5);
        }
        else if(days>10)
        {
            charge+=500*5 + 400*5 + 200*(days-10);
        }
        else
        {
            System.out.println("Invalid");
        }
    }
    void display()
    {
        System.out.println("Bike no. \t Phone no. \t Name \t No. of days \t Charge");
        System.out.println(name+"\t"+phno+"\t"+name+"\t"+days+"\t"+charge);
    }
    public static void main(String args[])
    {
        mobike obj =new mobike();
        obj.input();
        obj.compute();
        obj.display();
    }
}