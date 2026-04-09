import java.util.*;
public class Comparearr
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[20];                    //Creating the array
        System.out.println("Please Enter 20 numbers:");
        for (int i=0; i<20; i++)        //running a loop to accept 20 values from the array
        {
            arr[i] = sc.nextInt();
        }
        int min = arr[0], max = arr[0], sum = 0;
        for (int c = 0; c<arr.length; c++)                //loop to find the maximum and minimum value
        {
            if (arr[c] < min)                       //checking the condition => If the value is less the first value
            {
                min = arr[c];
            }   
            if (arr[c]>max)
            {
                max = arr[c];
            }   
            sum += arr[c];
        }
        
        System.out.println("The Largest No. is: " + max);           //Display the results
        System.out.println("The Smallest No. is: = " + min);
        System.out.println("Sum = " + sum);
    }
}