public class TechNumbersQ16
{
    public static void main(String args[])
    {
        int i,h1,h2,sum;
        for (i = 1000; i <= 9999; i++)  //loop for getting all the four digit numbers
        {
            h1 = i % 100;       //first half of numbers
            h2 = i / 100;       //second half of numbers
            sum = h1 + h2;      //sum of both halves
            if (i == Math.pow(sum,2))       //checking the condition
            {
                System.out.println(i);
            }
        }
    }
}