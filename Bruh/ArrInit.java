public class ArrInit
{
    public static void main(String args[])
    {
        int arr[]={2,5,4,1,3};
        int max=arr[0],min=arr[0],sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
                max=arr[i];
            if(arr[i]<min)
                min=arr[i];
            sum+=arr[i];
        }
        System.out.println("Maximum value: "+max);
        System.out.println("Minimum value: "+min);
        System.out.println("Sum of the elements: "+sum);
    }
}
