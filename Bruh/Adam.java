import java.util.*;
public class Adam
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        String name[] =new String[5];
        String sk;
        int l=0,u=name.length,m;
        System.out.println("Enter 10 names: ");
        for(int i=0;i<name.length;i++)
        {
            name[i]=sc.next();
        }
        for(int i=0;i<name.length-1;i++)
        {
            for(int j=0;j<name.length-i-1;j++)
            {
                if(name[j].compareToIgnoreCase(name[j+1])>1)
                {
                    sk=name[j+1];
                    name[j+1]=name[j];
                    name[j]=sk;
                }
            }
        }
        
        System.out.println("Sorted: ");
        for(int i=0;i<name.length;i++)
        {
            System.out.println(name[i]+", ");
        }
        System.out.println("Enter the name u would like to search for pls: ");
        sk=sc.next();
        while(l<=u)
        {
            m=(l+u)/2;            
            if(sk.compareToIgnoreCase(name[m])>0)
            {
                l=m;
            }
            else if(sk.compareToIgnoreCase(name[m])<0)
            {
                u=m;
            }
            else if(sk.compareToIgnoreCase(name[m])==0)
            {
                System.out.println("Found! at position: "+(m+1));
                break;
            }
            else
            {
                System.out.println("Not found: ");
            }
        }
    }
}