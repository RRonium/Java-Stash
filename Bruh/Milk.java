import java.util.*;
public class Milk
{
    public static void main(String args[])
    {
        /*int arr[]={9,8,3,1,9,7,5,5,8,0};
        int tmp=0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
        
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+", ");
        }*/
        
        //
        
        /*
        String name[] ={"My","name","is","Sannidhya","Biswas"};
        String tmp="";
        for(int i=0;i<name.length;i++)
        {
            for(int j=0;j<name.length-i-1;j++)
            {
                if(name[j].compareToIgnoreCase(name[j+1])>1)
                {
                    tmp=name[j];
                    name[j]=name[j+1];
                    name[j+1]=tmp;
                }
            }
        }
        for(int i=0;i<name.length;i++)
        {
            System.out.print(name[i]+", ");
        }*/
        /*
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        double res=1.0;
        for(int n=num;n>0;n--)
        {
            res *= n;
        }
        System.out.println(res);
        */
        
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt(),flag=0;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                System.out.println("Not a prime number");
                System.exit(0);
            }
            
        }      
        System.out.println("Prime number");
    }        
}