import java.util.*;
class Pairs
{
    void accept()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter no. of no. :");
        int arr[] =new int[sc.nextInt()];
        System.out.println("Enter the elements: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target no. pls: ");
        int target =sc.nextInt();
        compute(target,arr);
    }
    void compute(int target, int arr[])
    {
        int key;
        String str="";
        for(int i=0;i<arr.length;i++)
        {
            str=str+Integer.toString(arr[i]);
        }
        for(int i=0;i<arr.length;i++)
        {
            key=target-arr[i];
            for(int j=i+1;j<arr.length;j++)
            {                
                if(arr[j]==key)
                    System.out.println("("+arr[i]+","+key+")");
                str.replaceAll(Integer.toString(key),"");
            }
        }
    }
    public static void main(String args[])
    {
        Pairs obj =new Pairs();
        obj.accept();        
    }
}