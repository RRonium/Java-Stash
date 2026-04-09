public class TimeW
{
    void printWords(int h, int m)
    {
        String num[] = { "zero", "one", "two", "three", "four","five", "six", "seven", "eight", "nine","ten", "eleven", "twelve", "thirteen","fourteen", "fifteen", "sixteen", "seventeen","eighteen", "nineteen", "twenty", "twenty one","twenty two", "twenty three", "twenty four","twenty five", "twenty six", "twenty seven","twenty eight", "twenty nine"};      
        
        if (m==0)
            System.out.println(num[h] + " o' clock ");                  
        else if (m==15)
            System.out.println("quarter past " + num[h]);
      
        else if (m==30)
            System.out.println("half past " + num[h]);      
        else if (m==45)
            System.out.println("quarter to " +num[(h % 12) + 1]);      
        else if (m<=30)
            System.out.println( num[m] + " minutes past " +num[h]);      
        else if (m>30)
            System.out.println( num[60 - m] + " minutes to " +num[(h%12) + 1]);
    }      
    public static void main(String args[])
    {
        TimeW obj =new TimeW();
        int h = 6;
        int m = 24;
        obj.printWords(h,m);
    }
}