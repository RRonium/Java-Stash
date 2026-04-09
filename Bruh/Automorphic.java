import java.util.*;
public class Automorphic
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter a number pls: ");
        int num = sc.nextInt(),sq = num*num;
        String str = Integer.toString(sq);
        sq = Integer.parseInt(str.substring(str.length()-2));              
        System.out.println(sq==num?"Is an Automorphic number":"Isn't an automorphic number");
    }
}