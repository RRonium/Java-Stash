class Grapes
{
    public static void main(String args[])
    {
        String str="Betty bought butter from the gutter";
        int flag=0;
        for(int i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i)==str.charAt(i+1))
            {
                flag++;
            }
        }
        System.out.println(flag);
    }
}