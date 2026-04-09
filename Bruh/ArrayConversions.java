class ArrayConversions
{
    public static void main(String args[])
    {
        char chars[] = {'a','b','c'};
        String s = new String(chars);
        System.out.println(s);
        
        String str =" Hello ";
        char arr[] = str.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+", ");
        }
    }
}
 