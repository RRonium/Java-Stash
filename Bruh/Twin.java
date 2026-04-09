import java.util.*;
class Twin
{
    Twin()
    {
    }
    void showPrime(int a, int b)
    {
        System.out.println("("+a+","+b+")");
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        Twin obj =new Twin();
        System.out.println("Enter two numbers in the range 10-1000");
        int m=sc.nextInt(),n=sc.nextInt(),num,flag=0;
        if(m<=10 || n>=1000)
        {
            System.out.println("Invalid input");
            System.exit(0);
        }
                    
        for(int i=m;i<=n-2;i++)
        {
            num=i;
            for(int c=2;c<=(num/2);c++)
            {
                if(num%c==0)
                    flag++;                    
            }            
            if(flag==0)
            {
                for(int c=2;c<=((num+2)/2);c++)
                {
                    if((num+2)%c==0)
                        flag++;                    
                }  
            }
            if(flag==0)
            {                
                obj.showPrime(num,(num+2));
            }
            flag=0;
        }
        
    }
}