import java.io.*;
import java.util.*;
class OverflowError extends Exception
{
	public OverflowError(String message)
	{
		super(message);
	}
}
class OrderDetails
{
	static int ordersofar=0;
	int ordno;
	int icode;
	int qty;
	public OrderDetails()
	{
		ordno=0;
		icode=0;
		qty=0;
	}
	public OrderDetails(int i,int q)
	{
		ordno=++ordersofar;
		icode=i;
		qty=q;
	}
}
class OrderQueue
{
	OrderDetails []que=new OrderDetails[50];
	static int front=-1,rear=-1;
	public void add(int ic,int qt)
	{
		try
		{
			if(rear==-1)
			{
				rear++;
				front++;
				que[rear]=new OrderDetails(ic,qt);
			}
			else if(rear==49)
			{
				throw new OverflowError("No more oder possible. StockOver!!!");
			}
			else
			{
				rear++;
				que[rear]=new OrderDetails(ic,qt);
			}
		}
		catch(OverflowError e)
		{
			System.out.println(e);
		}
	}
	public int remove()
	{
		int on;
		if(isEmpty())
			return -1;
		if(front==rear)
		{
			on=que[front].ordno;
			front=-1;
			rear=-1;
		}
		else
		{
			on=que[front].ordno;
			front++;
		}
		return on;
	}
	public boolean isEmpty()
	{
		if(front==-1)
			return true;
		return false;
	}
	public int getQty()
	{
		if(front==-1)
			return -1;
		return que[front].qty;
	}
	public void display()
	{
		int a=1;
		if(isEmpty())
		{
			System.out.println("ORDER QUEUE EMPTY");
			return;
		}
		for(int i=front;i<=rear;++i)
		{
			System.out.println(" "+ a++ +"::OrderNo."+que[i].ordno+" Item Code: "+que[i].icode+" Quantity: "+que[i].qty);
			System.out.println("|");
			System.out.println("|");
			System.out.println("V");
		}
		System.out.println("END");
		System.out.println();
	}
}
public class Order
{
	static int orderstaken=0;
	static int ono;
	static OrderQueue OQ=new OrderQueue();
	static Scanner kbd=new Scanner(System.in);
	public static void displayItems()
	{
		try
		{
			Scanner in=new Scanner(new FileReader("icecr.txt"));
			String line1,line2;
			System.out.println("We have ICECREAMS in this flavours available");
			System.out.println();
			while(in.hasNext())
			{
				line1=in.nextLine();
				line2=in.nextLine();
				if(!line1.equals("..."))	
				{
					System.out.println(line1);
					System.out.println("-------------------------------------------------------");
					System.out.println();
					if(!in.hasNextLine())
						break;
				}
				else
				{
					in.close();
					break;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("error in Opening/Reading file"+e);
		}
	}
	public static void takeorder()
	{
		ono=++orderstaken;
		int icode,qty;
		System.out.println("Your order please...");
		System.out.println("Enter Item Code:");
		icode=kbd.nextInt();
		System.out.println("Enter Quantity");
		qty=kbd.nextInt();
		System.out.println("Your Order details are:");
		System.out.println("OrderNo.:"+ono+" Item no.:"+icode+" Quantity:"+qty);
		System.out.println("Please wait you are in QUEUE");
		OQ.add(icode,qty);
		System.out.println("Press C to continue...");
		String count=kbd.next();
		System.out.println();
	}
	public static void processOrder()
	{
		int qt=OQ.getQty();
		int on=OQ.remove();
		if(on==-1)
			return;
		else
		{
			int amt=qt*15;
			System.out.println("Order no. "+on+" READY!!! Amount payable Rs. "+amt);
		}
	}
	public static void QueStat()
	{
		OQ.display();
	}
	public static void processLeftOverOrders()
	{
		while(!OQ.isEmpty())
		{
			processOrder();
		}
	}
	public static void main(String[] args) throws Exception
	{
			int low=1,high=4;
			String ans="y";
			displayItems();
			while(ans.equals("y")==true||ans.equals("Y")==true)
			{
				takeorder();
				int rnd=(int)(Math.random()*(high-low+1))+low;
				if(rnd%2==0)	
				{
					for(int i=0;i<rnd;++i)
					{
						takeorder();
					}
				}
				for(int i=0;i<rnd;++i)
				{
					processOrder();
				}
				System.out.println("More orders?...(y/n) Press Q to check the QUEUE Status.");
				ans=kbd.next();
				if(ans.equals("q")==true||ans.equals("Q")==true)
				{
					QueStat();
					ans="Y";
				}
			}
			processLeftOverOrders();
	}
}