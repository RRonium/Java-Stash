import java.util.*;
class Godzilla
{
    int n=0;
    void accept()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter a number:");
        n=sc.nextInt();;
    }
    void fasc(Godzilla obj)
    {
        String s1=Integer.toString(n),s2=Integer.toString(n*2),s3=Integer.toString(n*3);
        System.out.println(s1+", "+s2+", "+s3);
        String s=s1+s2+s3;
        System.out.println(s);
        char arr[] ={'1','2','3','4','5','6','7','8','9'};
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(s.charAt(i)==arr[j])
                {
                    arr[j]='k';
                }                
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+", ");
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!='k')
            {
                System.out.println("!Not Fascinating number!");
                System.exit(0);
            }
        }
        System.out.println("Fascinating number!");
    }    
    public static void main(String args[])
    {
        Godzilla obj =new Godzilla();
        obj.accept();
        obj.fasc(obj);
    }
}