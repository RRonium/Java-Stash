class Test_Stack
{
    int arr[];
    int size,top;
    Test_Stack(int n)
    {
        size=n;
        arr =new int[size];
        top=-1;
    }
    void push(int n)
    {
        if(top==size-1)
        {
            System.out.println("Overflow");
        }
        else
        {
            arr[++top]=n;
        }
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.println("Underflow");
        }
        else
        {
            --top;
        }
    }
    void peep()
    {
        if(top==-1)
        {
            System.out.println("Underflow");
        }
        else
        {
            System.out.println(arr[top]);
        }
    }
    public static void main(String args[])
    {}
}