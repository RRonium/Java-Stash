public class DecimalToBinary
{
    String DecimalToBinary(int d) 
    {
        if (d==0)
        {
            return "0"; 
        }
        else if (d==1)
        {
            return "1"; 
        }
        else
        {
            int q=d/2;
            int r=d%2;
            return DecimalToBinary(q) + Integer.toString(r);
        }
    }
    public static void main(String[] args)
    {
        DecimalToBinary obj =new DecimalToBinary();
        int dec = 42; 
        String bin = obj.DecimalToBinary(dec);
        System.out.println("Binary representation of " + dec + " is: " + bin);
    }
}