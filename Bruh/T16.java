import java.util.*;
class T16
{ 
    Scanner sc =new Scanner(System.in);
    String name;
    int w, charge;
    void accept()   //Define accept method for accepting the values from the user
    {
        System.out.println("Please enter your name: ");
        name = sc.next();
        System.out.println("Please specify the weight of your parcel:(in kg) ");
        w = sc.nextInt();
    }
    void calculate()    //Method for calculation
    {
        if(w<=10)
        {
            charge = 25*w;
        }
        else if(w>10 && w<=30)
        {
            charge = 20*w;
        }
        else if(w>30)
        {
            charge = 10*w;
        }
        else
        {
            System.out.println("Invalid");
        }

        charge+=charge*5/100;

    }
    void print()        //Method for display
    {
        System.out.println("Name"+"           "+"Weight"+"            "+"Bill Amount");
        System.out.println(name+"           "+w+"            "+charge);
    }
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        T16 obj =new T16();
        obj.accept();   //Calling the method
        obj.calculate();
        obj.print();
    }
}
 