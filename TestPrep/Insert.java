import java.util.*;
class Insert
{
    String str="";
    char ch;
    int in;
    void accept()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Pls enter a string: ");
        str=sc.nextLine();
        System.out.println("Enter the index of character to be replaced: ");
        in=sc.nextInt();
        System.out.println("Enter the character to be replaced with: ");
        ch=sc.next().charAt(0);
        if(in>str.length()-1)
        {
            System.out.println("Invalid");
            System.exit(0);
        }
    }
    void replace()
    {
        String s=str.substring(0,in).concat(Character.toString(ch)).concat(str.substring(in+1));
        System.out.println("New String is: "+s);
    }
    public static void main(String args[])
    {
        Insert obj =new Insert();
        obj.accept();
        obj.replace();
    }
}