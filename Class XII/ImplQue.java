class Queue
{
	private static int front,rear,capacity;
	private static int queue[];
	Queue(int size)
	{
		front=rear=0;
		capacity=size;
		queue=new int[capacity];
	}
	static void queueEnq(int item)
	{
		if(capacity==rear)
		{
			System.out.println("Queue is full");
			return;
		}
		else
		{
			queue[rear]=item;
			rear++;
		}
		return;
	}
	static void queueDeq()
	{
		if(front==rear)
		{
			System.out.println("Queue is Empty");
			return;
		}
		else
		{
			for(int i=0;i<rear-1;i++)
			{
				queue[i]=queue[i+1];
			}
			if(rear<capacity)
			{
				queue[rear]=0;
			}
			rear--;
		}
		return;
	}
	static void queueDisp()
	{
		int i;
		if(front==rear)
		{
			System.out.println("Queue is Empty");
			return;
		}
		for(i=front;i<rear;i++)
		{
			System.out.print(queue[i]+" ");
		}
		System.out.println();
		return;
	}

}
public class ImplQue
{
	public static void main(String[] args) {
		Queue q=new Queue(4);
		q.queueEnq(10);
		q.queueEnq(20);
		q.queueEnq(30);
		q.queueEnq(40);
		q.queueDisp();
		q.queueDeq();
		q.queueDisp();
		q.queueDeq();
		q.queueDeq();
		q.queueDeq();
		q.queueDeq();
		q.queueDisp();
	}
}