import java.util.*;
class Delta
{
    String str="";
    String accept()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a String pls: ");
        str=sc.nextLine();     
        return str;
    }        
    void check(String str)
    {
        //System.out.println(str.charAt(str.length()-1));
        if(Character.isLetterOrDigit(str.charAt(str.length()-1))==true)
        {
            System.out.println("No punctuation");
            System.exit(0);
        }
        
        String arr[] = str.split(" ");
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                String tmp="";
                if(arr[j].length()<arr[i].length())
                {
                    System.out.println("true");
                    tmp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
                if(arr[i].length()==arr[j].length())
                {             
                    System.out.println("true");
                    if(arr[j].compareToIgnoreCase(arr[i])<1)
                    {
                        tmp = arr[i];
                        arr[i]=arr[j];
                        arr[j]=tmp;
                    }                    
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }        
    }
    public static void main(String args[])
    {
        //new Delta().accept();
        new Delta().check(new Delta().accept());
    }
}