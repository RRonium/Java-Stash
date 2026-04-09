import java.util.*;
public class Dudeney 
{
    public static int digisum(int num) 
    {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }    
    static boolean isDudeney(int num) 
    {
        int cbrt = (int) Math.round(Math.cbrt(num)); 
        return (Math.pow(cbrt,3) == num) && (digisum(num) == cbrt);
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();        
        if (isDudeney(num))
        {
            System.out.println(num + " is a Dudeney number.");
        }
        else 
        {
            System.out.println(num + " is not a Dudeney number.");
        }        
    }
}
