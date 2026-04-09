import java.util.*;
class Lmao4
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int arr[][] =new int[4][4];
        int huh[][] =new int[4][4];        
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
                System.out.print(arr[i][c]+", ");
            }
            System.out.println();
        }
        
        System.out.println("Flip");
        
        for(int i=3;i>=0;i--)
        {
            for(int c=3;c>=0;c--)
            {
                huh[3-i][3-c]=arr[i][c];
            }
        }
        for(int i=0;i<4;i++)
        {
            for(int c=0;c<4;c++)
            {
                System.out.print(huh[i][c]+", ");
            }
            System.out.println();
        }
        /*for(int i=3;i>=0;i--)
        {
            for(int c=3;c>=0;c--)
            {
                System.out.print(arr[i][c]+", ");
            }
            System.out.println();
        }*/}
}