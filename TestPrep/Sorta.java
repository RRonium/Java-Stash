import java.util.*;
class Sorta
{
    int arr[][];
    int r,c;
    void accept()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter rows and columns: ");
        r=sc.nextInt();
        c=sc.nextInt();
        arr =new int[r][c];
        
        System.out.println("Enter elements now: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }    
    void calc()
    {
        System.out.println("Unsorted: ");
        disp(arr);
        int temp;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c-1;j++)
            {
                for(int z=0;z<c-j-1;z++)
                {
                    if(arr[i][z]>arr[i][z+1])
                    {
                        temp=arr[i][z+1];
                        arr[i][z+1]=arr[i][z];
                        arr[i][z]=temp;
                    }
                }
            }
        }
        System.out.println("Sorted: ");
        disp(arr);
    }
    void disp(int dick[][])
    {
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(dick[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
       Sorta obj =new Sorta();
       obj.accept();
       obj.calc();       
    }
}