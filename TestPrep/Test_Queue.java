class Test_Queue
{
    int arr[];
    int size,front,rear;
    Test_Queue(int n)
    {
        size=n;
        front=-1;
        rear=-1;
        arr =new int[size];
    }
    void queue(int n)
    {
        if(rear==size-1)
        {
            System.out.println("Overflow");            
        }
        else if(front==-1 && rear==-1)
        {
            front++;
            arr[++rear]=n;
        }
        else
        {
            arr[++rear]=n;
        }
    }    
    void dequeue(int n)
    {
        if(rear==-1 && front==-1)
        {
            System.out.println("Underflow");
        }
        else if(front==rear)
        {
            front=-1;
            rear=-1;
        }
        else
        {
            front++;
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
                System.out.print(arr[i]);
            }
        }
    }
}