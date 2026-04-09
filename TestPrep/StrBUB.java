public class StrBUB
{
    public static void main(String args[])
    {
        String arr[] = {"My","name","is","Sannidhya","Biswas"};
        String tmp = "";
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j].compareToIgnoreCase(arr[j+1])>0)
                {
                    tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}