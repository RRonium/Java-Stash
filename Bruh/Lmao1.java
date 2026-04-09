import java.util.*;
class Lmao1
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int arr[][] =new int[4][4];
        int sum1=0,sum2=0;
        for(int i=0;i<4;i++)
        {
            for(int c=0;c<4;c++)
            {
                arr[i][c]=sc.nextInt();
            }
        }
        
        for(int i=0;i<4;i++)
        {
            for(int c=0;c<4;c++)
            {
                System.out.print(arr[i][c]+" ");
            }
            System.out.println();
        }
        
        
        for(int i=0;i<4;i++)
        {
              sum1+=arr[i][i];               
              sum2+=arr[i][3-(i+1)];           
        }
        System.out.println("First result:"+ sum1);
        System.out.println("Second result:"+ sum2);        
    }
}