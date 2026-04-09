import java.util.*;
public class T12
{
  int totamt=0, coach;
  long mobno;
  String name;
  public void accept()              //method for accepting the values from the user
  {
    Scanner sc =new Scanner(System.in);
    System.out.println("Name: ");
    name = sc.next();
    System.out.println("Mobile no.: ");
    mobno = sc.nextLong();
    System.out.println("Enter 1 for first class AC, 2 for second class AC, 3 for third class AC, 4 for sleeper class: ");
    coach = sc.nextInt();
  }
  public void update()                  //Calculating the price of the ticket with accordance to the coach the user chooses
  {
    System.out.println("Ticket price: ");
    totamt +=200;
    if(coach==1)
    {
      totamt+= 700;
      System.out.println("Ticket price: "+totamt);
    }
    else if(coach==2)
    {
      totamt+= 500;
      System.out.println("Ticket price: "+totamt);
    }
    else if(coach==3)
    {
      totamt+= 250;
      System.out.println("Ticket price: "+totamt);
    }
    else if(coach==4)
    {
      System.out.println("Ticket price: "+totamt);
    }
    else
    {
      System.out.println("Invalid option");
    }
  }
  public static void main(String[] args)            //calling of the methods in the main method
  {
    T12 obj =new T12();
    obj.accept();
    obj.update();
  }
} 