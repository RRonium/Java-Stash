import java.util.*;
class StrLegend
{
    String s1="",s2="apple",s3="cat",s4="Cat",s5="Queensboro",s6="Queensboro",s7="bruddaturnedtheruddaintoamudda",s8="bruddaturnedtheruddaintoamudda",emp="";
    char ch1;
    void accept()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("s1: ");
        s1=sc.nextLine();
        System.out.println("Char sk: ");
        ch1=sc.next().charAt(0);
    }
    void calc1()
    {
        System.out.println("indexOf: "+s1.indexOf(Character.toString(ch1)));
        System.out.println("lastIndexOf: "+s1.lastIndexOf(Character.toString(ch1)));
        System.out.println("isEmpty test1: "+s1.isEmpty());
        System.out.println("isEmpty test2: "+emp.isEmpty());        
    }
    void calc2()
    {
        System.out.println("compareTo"+s2.compareTo(s3));
        System.out.println("compareToIgnoreCase: "+s2.compareToIgnoreCase(s4));
        System.out.println("replace(1): "+s5.replace('e','z'));
        System.out.println("replace(2): "+s6.replace("ee","xx"));
        System.out.println("replaceAll: "+s7.replaceAll("vanc","sorb"));
        System.out.println("replaceFirst:"+s8.replaceFirst("dda","xyz"));
    }
    public static void main(String args[])
    {
        StrLegend obj =new StrLegend();
        obj.accept();
        obj.calc1();
        obj.calc2();
    }
}