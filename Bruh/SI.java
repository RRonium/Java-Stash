import java.util.*;
public class SI
{
    public static void main()
    {
       
       Scanner p =new Scanner(System.in);
       int p2 = p.nextInt();
       Scanner t =new Scanner(System.in);
       int t2 = t.nextInt();
       Scanner r =new Scanner(System.in);
       int r2 = r.nextInt();
       int si = p2*t2*r2/100;
       int A= si+p2;
       
       System.out.println("This is the simple interest" + si);
       System.out.println("This is the total amount:" + A);
    }
}
