import java.util.*;
public class array69
{
    public static void main(String[] args) 
    {
        /*Scanner sc =new Scanner(System.in);
        String s = "Hello";
        char ch[] = s.toCharArray();
        
        for(int i=0;i<ch.length;i++)
        {
            System.out.println(ch[i]+", ");
        }         

        int arr[] = {4,2,6,1,9};
        int tmp=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }*/
        
        //Palindrome
        String str="madom";
        int flag=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=str.charAt(str.length()-i-1))
            {
                flag++;
                break;
            }
        }    
        System.out.println(flag==0?"Is a palindrome":"Isn't a Palindrome");
        System.out.println(str.length());
        
    }
}