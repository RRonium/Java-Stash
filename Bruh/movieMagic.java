import java.util.*;
public class movieMagic
{
    int year;
    String title;
    float rating;
    movieMagic()
    {
        year=0;
        title="";
        rating = 0;
    }
    void accept()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter year: ");
        year=sc.nextInt();
        System.out.println("Enter the title of the movie: ");
        title=sc.nextLine();
        System.out.println("Enter the rating: ");        
        rating=sc.nextFloat();
    }
    void display()
    {
        if(rating>=0.0 && rating<=2.0)
        {
            System.out.println("Flop");
        }
        else if(rating>=2.1 && rating<=3.4)
        {
            System.out.println("Semi-Hit");
        }
        else if(rating>=3.5 && rating<=4.5)
        {
            System.out.println("Hit");
        }
        else if(rating>=4.6 && rating<=5.0)
        {
            System.out.println("Super Hit");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
    public static void main(String args[])
    {             
        movieMagic obj =new movieMagic();
        obj.accept();
        obj.display();
    }
}