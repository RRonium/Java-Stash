import java.util.*;
public class ArrSwapQ18
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int arr[] =new int[10];
        int i,c=0,tmp=0;
        for(i=0;i<arr.length;i++)               //loop for accepting the value for the array 
        {
            System.out.println("Enter a number: ");
            arr[i]=sc.nextInt();                //assigning the value to their respective index no.
        }
        System.out.println("The array Pre-swap");
        for(i=0;i<arr.length;i++)               //Dsiplaying the array before the swap
        {
            System.out.print(arr[i]+" ");
        }
        for(i=0;i<arr.length;i++)             //swapping loop
        {
            c++;

            arr[i]=arr[c];
            arr[c]=tmp;
            i++;
            c++;
        }
        System.out.println("The array Post-swap");
        for(i=0;i<arr.length;i++)                       //displaying the variable after swapping their indexes
        {
            System.out.println(arr[i]+" ");
        }
    }
}
