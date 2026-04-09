import java.util.*;
class Stack2
{
    int cap,top;
    int s[];
    Stack2(int nn)
    {
        cap=nn;
        top=-1;
        s =new int[cap];        
    }
    void push(int val)
    {
        if(top<cap-1)
        {
            s[++top]=val;
        }
        else
        {
            System.out.println("Stack overflow");
        }
    }
    int pop()
    {
        if(top>=0)
        {
            return s[top--];
        }
        else
            return -9999;
    }
    public static void main(String args[])
    {
        
    }
}