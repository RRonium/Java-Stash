import java.util.*;
class Matrix1
{
    int arr[][];
    int r,c;
    void accept()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter rows and columns pls: ");
        r=sc.nextInt();
        c=sc.nextInt();
        arr =new int[r][c];
        
        System.out.println("Enter elements to the array: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("Initialized array: ");
        disp(arr);
    }
    void shift()
    {
        int num=arr[0][0],pos_r=0,pos_c=0;
        int shift[][] =new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i==0)
                {
                    shift[r-1][j]=arr[i][j];
                    if(arr[i][j]>num)
                    {
                        num=arr[i][j];
                        pos_r=(r-1);
                        pos_c=j;
                    }
                }
                else
                {
                    shift[i-1][j]=arr[i][j];
                    if(arr[i][j]>num)
                    {
                        num=arr[i][j];
                        pos_r=(i-1);
                        pos_c=j;
                    }
                }
            }
        }
        System.out.println("Shifted array: ");
        disp(shift);
        System.out.println("Greatest element: "+num);
        System.out.println("Row: "+ ++pos_r +"Column: "+ ++pos_c);
    }
    void disp(int dick[][])
    {
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(dick[i][j]+"   ");
            }            
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Matrix1 obj=new Matrix1();
        obj.accept();
        obj.shift();        
    }
}