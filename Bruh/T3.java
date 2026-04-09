import java.util.*;
class T3
{
    public static void main(String[] args)
    {
        double eng, math, science;
        Scanner sc =new Scanner(System.in);
        System.out.println("Plz enter class XI percentages that you've received in English, Maths, Science respectively: ");
        eng = sc.nextDouble();
        math = sc.nextDouble();
        science = sc.nextDouble();

        if(eng>=80 && math>=80 && science>=80)
        {
            System.out.println("The stream alloted to you is Pure Science");
        }
        else if(eng>=80 && math>=60 && science>=80)
        {
            System.out.println("The stream alloted to you is Bio Science");
        }
        else if(eng>=60 && math>=60 && science>=60)
        {
            System.out.println("The stream alloted to you is Commerce");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}
 