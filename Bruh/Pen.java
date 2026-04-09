public class Pen
{
    boolean isPrime(int n, int i)
    {
        if (n<=2) 
        {
            return (n == 2) ? true : false;
        }        
        if (n%i == 0) 
        {
            return false;
        }
        return isPrime(n,i++);
    }
    public static void main(String[] args) 
    {
        Pen obj=new Pen();
        int num = 29; 
        if(obj.isPrime(num, 2))
        {
            System.out.println(num + " is a prime number.");
        }
        else 
        {
            System.out.println(num + " is not a prime number.");
        }
    }
}
