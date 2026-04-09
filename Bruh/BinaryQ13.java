import java.util.*;
public class BinaryQ13
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        int n[] = {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010};
        
        System.out.print("Enter graduation year to search: ");
        int year = in.nextInt();
        
        int l = 0, h = n.length - 1, idx = -1;
        while (l <= h) {
            int m = (l + h) / 2;
            if (n[m] == year) {
                idx = m;
                break;
            }
            else if (n[m] < year) {
                l = m + 1;
            }
            else {
                h = m - 1;
            }
        }
        
        if (idx == -1)
            System.out.println("Record does not exist");
        else
            System.out.println("Record exists");
    }
}