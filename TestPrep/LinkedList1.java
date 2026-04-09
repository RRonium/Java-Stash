class LinkedList1
{
	Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public static LinkedList1 insert(LinkedList1 list,int data)
	{
		Node new_node=new Node(data);
		if(list.head==null)
		{
			list.head=new_node;
		}
		else
		{
			Node last=list.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=new_node;
		}
		return list;
	}
	public static void printList(LinkedList1 list)
	{
		Node currNode=list.head;
		System.out.println("List:");
		while(currNode!=null)
		{
			System.out.print(currNode.data+" ");
			currNode=currNode.next;
		}
	}
	public static void main(String[] args) 
	{
		LinkedList1 list=new LinkedList1();
		list=insert(list,5)	;
		list=insert(list,10);
		list=insert(list,15);
		printList(list);
	}
}