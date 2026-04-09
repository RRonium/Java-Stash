import java.util.*;
public class NumSum
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int arr[] =new int[20], resodd=0, reseven=0;        //creation of an array
        System.out.println("Enter 20 numbers: ");
        for(int i=0;i<20;i++)       //accepting the values
        {
            arr[i]=sc.nextInt();            //storing the accepted value into the array
            if(arr[i]%2==0)
            {
                reseven+=arr[i];            //Adding to the sum
            }
            else if(arr[i]!=0)
            {
                resodd+=arr[i];
            }
            else
            {
                System.out.println("INVALID");
            }           
        }
        System.out.println("The sum of all the even no.: "+reseven);        //displaying the results
        System.out.println("The sum of all the odd no.: "+resodd);
    }
}
