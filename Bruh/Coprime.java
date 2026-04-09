import java.util.*;
class Coprime
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n1=sc.nextInt(),n2=sc.nextInt();
        int flag=0;
        for(int i=1;i<=n1;i++)
        {
            if(n1%i==0 && n2%i==0)
            {
                flag++;
            }
        }
        if(flag==1)
            System.out.println("Co-Prime");
        else
            System.out.println("Not Co-Prime");
    }
}