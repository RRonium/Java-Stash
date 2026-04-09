class Stack
{
	static final int MAX=5;
	int top;
	int a[]=new int[MAX];
	boolean isEmpty()
	{
		return (top<0);
	}
	Stack ()
	{
	top=-1;
	}
	boolean push(int x)
	{
		if(top>=MAX-1)
		{
			System.out.println("Stack Overflow");
			return false;
		}
		else
		{
			a[++top]=x;
			System.out.println(x+" is pushed into stack");
			return true;
		}
	}
	int pop()
	{
		if(top<0)
		{
			System.out.println("Stack Underflow");
			return 0;
		}
		else
		{
			int x=a[top--];
			System.out.println(x+" is popped from Stack");
			return x;
		}
	}
	void print()
	{
		for(int i=top;i>-1;i--)
		{
			System.out.print(" "+a[i]);
		}
		System.out.println();
	}
	int peek()
	{
		if(top<0)
		{
			System.out.println("Stack Underflow");
			return 0;
		}
		else
		{
			int x=a[top];
			System.out.println(x+" is peeked");
			return x;
		}
	}
}
class DriverClass
{
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.print();
		s.pop();
		s.peek();
		s.print();

	}
}