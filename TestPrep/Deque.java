public class Deque
{
    int Q[];
    int size;
    int front, rear;
    Deque(int n)
    {
        size = n;
        Q = new int[size];
        rear = -1;
        front = -1;
    }
    void enqueue_front(int n)
    {
        if(front-1 == -1)
        {
            System.out.print("Overflow");
        }
        else
        {
            Q[--front] = n;
        }
    }
    void enqueue_back(int n)
    {
        if(rear == size - 1)
        {
            System.out.print("Overflow");
        }
        else if(rear == -1 && front == -1)
        {
            front++;
            Q[++rear] = n;
        }
        else
        {
            Q[++rear] = n;
        }
    }
    void dequeue_front()
    {
        if(rear == -1 && front == -1)
        {
            System.out.print("Underflow");
        }
        else if(rear == front)
        {
            front = -1;
            rear = -1;
        }
        else
        {
            front++;
        }
    }
    void dequeue_back()
    {
        if(rear == -1 && front == -1)
        {
            System.out.print("Underflow");
        }
        else if(rear == front)
        {
            front = -1;
            rear = -1;
        }
        else
        {
            rear--;
        }
    }
    void display()
    {
        if(front == -1 && rear == -1)
        {
            System.out.println("Empty Queue");
        }
        else
        {
            for(int i = front; i <= rear; i++)
            {
                System.out.print(Q[i]);
            }
        }
    }
}