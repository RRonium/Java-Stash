import java.util.*;
class Spiro
{
    static int n;
    static int arr[][];
    static void input1(int i)
    {
        Scanner sc = new Scanner(System.in);
        for(int k = 0; k < n-2*i; k++)
        {
            System.out.println("Enter the ("+(i+1)+","+(i+k+1)+") element");
            arr[i][i+k] = sc.nextInt();
        }
        for(int k = 1; k < n-2*i; k++)
        {
            System.out.println("Enter the ("+(i+k+1)+","+(n-i)+") element");
            arr[i+k][n-1-i] = sc.nextInt();
        }
        for(int k = 1; k < n-2*i; k++)
        {
            System.out.println("Enter the ("+(n-i)+","+(n-k-i)+") element");
            arr[n-i-1][n-k-i-1] = sc.nextInt();
        }
        for(int k = 1; k < n-2*i-1; k++)
        {
            System.out.println("Enter the ("+(n-i-k)+","+(i+1)+") element");
            arr[n-i-1-k][i] = sc.nextInt();
        }
        if(i<=(n+1)/2)
        {
            input1(i+1);
        }
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter a no.");
        n=sc.nextInt();
        arr =new int[n][n];        
    }
}