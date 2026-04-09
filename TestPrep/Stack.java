public class Stack
{
    int ST[];
    int size;
    int top;
    Stack(int n)
    {
        size = n;
        ST = new int[size];
        top = -1;
    }
    void push(int n)
    {
        if(top==size-1)
        {
            System.out.print("Overflow");
        }
        else
        {
            ST[++top] = n;
        }
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.print("Underflow");
        }
        else
        {
            --top;
        }
    }
    void peep()
    {
        if(top == -1)
        {
            System.out.print("Underflow");
        }
        else
        {
            System.out.println(ST[top]);
        }
    }
}