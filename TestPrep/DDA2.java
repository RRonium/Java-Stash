import java.util.*;
class DDA2
{
    int arr[][];
    int n,m; 
    void accept()
    {
        Scanner sc =new Scanner(System.in);

        System.out.println("Please enter matrix sides: ");
        n=sc.nextInt();
        m=sc.nextInt();
        arr =new int[n][m];
        
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }
    void real()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if((i==0 || i==(n-1)) && (j==0 || j==(m-1)))
                {
                    System.out.print(arr[i][j]+" ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        DDA2 obj =new DDA2();
        obj.accept();
        obj.real();
    }
}