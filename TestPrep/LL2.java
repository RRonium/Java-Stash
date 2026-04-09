class LL2
{
	Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			this.data=d;
			this.next=null;
		}
	}
	public static LL2 insert(LL2 list,int data)
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
	public static void printList(LL2 list)
	{
		Node currNode=list.head;
		System.out.print("List is:");
		while(currNode!=null)
		{
			System.out.print(currNode.data+" ");
			currNode=currNode.next;
		}
		System.out.println();
	}
	public static LL2 deleteByKey(LL2 list,int key)
	{
		//Case 1
		Node currNode=list.head,prev=null;
		if(currNode!=null && currNode.data==key)
		{
			list.head=currNode.next;
			System.out.println(key+ " found and deleted");
			return list;
		}
		//Case 2
		while(currNode!=null && currNode.data!=key)
		{
			prev=currNode;
			currNode=currNode.next;
		}
		if(currNode!=null)
		{
			prev.next=currNode.next;
			System.out.println(key+ " found and deleted");
		}
		//Case 3
		if(currNode==null)
		{
			System.out.println(key +" is not available to delete");
		}
		return list;
	}
	public static LL2 deleteByPosition(LL2 list,int index)
	{
		Node currNode=list.head, prev=null;
		//Case 1: Head node itself to be deleted
		if(index==0&&currNode!=null)
		{
			list.head=currNode.next;
			System.out.println("\n"+ index+" position element deleted");
			return list;
		}
		//Case 2: 
		int counter=0;
		while(currNode!=null)
		{
			if(counter==index)
			{
				prev.next=currNode.next;
				System.out.println("\n"+ index+" position element deleted");
				break;
			}
			else
			{
				prev=currNode;
				currNode=currNode.next;
				counter++;
			}
		}
		//Case 3: 
		if(currNode==null)
		{
			System.out.println("\n"+index+" position element not found");
		}

		return list;
	}
	public static void main(String[] args) 
	{
		LL2 list=new LL2();
		list=insert(list,1)	;
		list=insert(list,2)	;
		list=insert(list,3)	;
		list=insert(list,4);
		list=insert(list,5);
		list=insert(list,6)	;
		list=insert(list,7)	;
		list=insert(list,8)	;
		printList(list);
		deleteByPosition(list,10);
		printList(list);
	}
}