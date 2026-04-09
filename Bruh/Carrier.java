import java.util.*;
class Carrier
{
    int n;
    void accept()
    {
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();        
    }        
    void vamp()
    {
        int d=(int)Math.log(n)+1;
        int arr[] =new int[d];
        for(int i=0,num=n;i<arr.length;i++)
        {
            arr[i]=num%10;
            num/=10;
        }
        
    }
}