import java.util.*;
class DDA1
{
    int arr[][];
    int N; 
    void accept()
    {
        Scanner sc =new Scanner(System.in);

        System.out.println("Please enter square matrix side: ");
        N=sc.nextInt();
        arr =new int[N][N];
        
        System.out.println("Enter elements: ");
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }
    void check()
    {
        int ld=0,rd=0,flag=0;
        
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                if(arr[i][j]!=arr[j][i])
                {
                    System.out.println("non-symmetric");
                    i=N;
                    flag=1;
                    break;                    
                }
            }
        }
        System.out.println(flag==0?"Matrix is Symmetric":"");
        for(int i=0;i<N;i++)
        {
            ld+=arr[i][i];
            rd+=arr[i][N-i-1];
        }
        System.out.println("left diagonal: "+ld+" right diagonal: "+rd);
        
    }
    public static void main(String args[])
    {
        DDA1 obj =new DDA1();
        obj.accept();
        obj.check();
    }
}