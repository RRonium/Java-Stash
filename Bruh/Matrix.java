import java.util.*;
class Matrix
{
    static Scanner sc =new Scanner(System.in);
    static void disp(int m)
    {
        int arr[][] =new int[m][m];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Array: ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        res(arr,m);
    }
    static void res(int arr[][],int m)
    {
        int ld=0,rd=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==j)
                    ld+=arr[i][j];
            }
            for(int j=0;j<m;j++)
            {
                if((i+j)==(m-1))
                    rd+=arr[i][j];
            }
        }
        System.out.println("Left Diagonal: "+ld);
        System.out.println("Right Diagonal: "+rd);
    }
    public static void main(String args[])
    {        
        System.out.println("Value of M: ");
        int m=sc.nextInt();
        disp(m);
    }
}