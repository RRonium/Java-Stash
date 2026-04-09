import java.util.*;
class Mask
{
    String str,msk,nstr;
    Mask()
    {
        str="";
        msk="";
        nstr="";
    }
    void accept()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the original String pls: ");
        str=sc.nextLine().toLowerCase();
        System.out.println("Enter the masked line: ");
        msk=sc.nextLine().toLowerCase();
    }
    void form()
    {
        nstr=str;
        for(int i=0;i<msk.length();i++)
        {
            nstr=nstr.replace(Character.toString(msk.charAt(i))," ");
        }
        String arr[] =nstr.split(" ");
        nstr="";
        for(int i=0;i<arr.length;i++)
        {
            nstr=nstr.concat(arr[i]);
        }
    }
    void display()
    {
        System.out.println("Original string: "+str);
        System.out.println("New String: "+nstr);
    }
    public static void main(String args[])
    {
        Mask obj =new Mask();
        obj.accept();
        obj.form();
        obj.display();
    }
}