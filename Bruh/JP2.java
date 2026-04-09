import java.util.*;
public class JP2
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        //Q1
        /*System.out.println("Enter name pls: ");
        String name = sc.nextLine();
        String lname = (name.substring(name.lastIndexOf(" "),name.length())).trim();
        String fname = (name.substring(0,name.lastIndexOf(" "))).trim();
        
        System.out.println(lname+" "+fname);*/
        
        //Q2
        /*System.out.println("Enter a String: ");
        String str = sc.nextLine();
        
        System.out.println("Enter the character u want to search for: ");
        char ch = sc.next().charAt(0);
        int flag=0;
        str=str.toUpperCase();
        ch=Character.toUpperCase(ch);
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch)
                flag++;
        }
        
        System.out.println("Character Frequency: "+flag);*/
        
        //Q3
        /*String s="My name is Alok Kumar Gupta and my age is 45 years";
        s=s.replace("Alok","Ashok");         
        s=s.replace("45","35");                                    
        System.out.println(s);*/
        
        //Q4
        System.out.println("Enter string pls: ");
        String str = sc.nextLine().trim(),res="";
        int flag=0,max=0;
        for(int i=0;i<str.length();i++)
        {
            if(Character.isWhitespace(str.charAt(i))==false)
            {
                final int c = i;
                flag++;
                if(flag>max)
                {
                    max=flag;
                }
                //res = res.concat(Character.toString(str.charAt(i)));
                
            }
            else
            {
                flag=0;
            }
        }        
        System.out.println(res+" "+flag);
    }
}