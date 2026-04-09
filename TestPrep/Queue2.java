import java.util.*;
class Queue2
{
    int q[],cap,front,rear;
    Queue2(int nn)
    {
        cap=nn;
        front=rear=0;
        q =new int[cap];        
    }
    void push(int val)
    {
        if(rear<cap-1)
        {
            q[++rear]=val;
        }
    }
    int pop()
    {
        if(front!=rear)
        {
            return q[++front];
        }
        else
        {
            return -9999;
        }
    }
    public static void main(String args[])
    {
        
    }
}