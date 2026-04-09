class KTG
{
    int fin=0;
    int recur(int n)
    {
        if(n==0)
        {
            return fin;
        }
        fin*=10;
        fin+=(n%10);
        n/=10;
        return recur(n);
    }    
    public static void main(String args[])
    {
    }
}