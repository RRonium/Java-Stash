import java.util.*;
class freq
{
    public static void main(String args[])
    {
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter String pls: ");
       String str=sc.next();
       str=str.toUpperCase();
       char arr[] = str.toCharArray();
       char tmp;
       int flag=0;
       
       for(int i=0;i<arr.length-1;i++)
       {
           for(int j=0;j<arr.length-i-1;j++)
           {
               if(arr[j+1]<arr[j])
               {
                   tmp=arr[j+1];
                   arr[j+1]=arr[j];
                   arr[j]=tmp;                   
               }
           }
       }
       String s =new String(arr);
       System.out.println("Sorted String: "+s);
       
       for(int i=0;i<s.length();i++)
       {
           
           tmp=s.charAt(i);
           for(int j=0;j<s.length();j++)
           {
               if(s.charAt(j)==tmp)
                    flag++;
           }
           System.out.println("Frequency of Letter "+tmp+" is: "+flag);
           flag=0;  
           
       }
    }        
}