import java.util.*;
public class STDQ20
{
    public static void main(String args[]) {
        final int size = 10;
        Scanner in = new Scanner(System.in);
        String cities[] = new String[size];         //creating the SDAs
        String stdCodes[] = new String[size];
        System.out.println("Enter " + size + " cities and their STD codes:");
        for (int i = 0;  i < size; i++)                 //loop for accpeting 10 city name and theri STDs
        {
            System.out.print("Enter City Name: ");
            cities[i] = in.nextLine();
            System.out.print("Enter its STD Code: ");
            stdCodes[i] = in.nextLine();
        }
        System.out.print("Enter name of city to search: ");
        String city = in.nextLine();
        int idx;
        for (idx = 0;  idx < size; idx++)               //locating the required city and STD
        {
            if (city.compareToIgnoreCase(cities[idx]) == 0) 
            {
                break;
            }
        }
        if (idx < size)                             //Display
        {
            System.out.println("Search Successful");
            System.out.println("City: " + cities[idx]);
            System.out.println("STD Code: " + stdCodes[idx]);
        }
        else 
        {
            System.out.println("Search Unsuccessful");
        }
    }
}