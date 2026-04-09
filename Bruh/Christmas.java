import java.util.*;
public class Christmas
{
    void joystring(String s, char ch1, char ch2)
    {
        s = s.replace(ch1,ch2);
        System.out.println(s);
    }
    void joystring(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                System.out.println("First Index of space: "+i);
            }
            
        }
        System.out.println("last Index od space: "+s.lastIndexOf(' '));
    }
    void joystring(String s1, String s2)
    {
        System.out.println(s1.concat(" ").concat(s2));
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        Christmas obj =new Christmas();
        System.out.println("For 1st & 2nd method: Enter a string and 2 chars: ");
        String s = sc.nextLine();
        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);
        
        System.out.println("For the 3rd method enter 2 string u want to concat: ");
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        
        obj.joystring(s,ch1,ch2);
        obj.joystring(s);
        obj.joystring(s1,s2);
    }
}