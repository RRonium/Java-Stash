class Insertion
{
    Node head;
    void IFront(int val)
    {
        Node temp =new Node(val);
        if(head==null)
        {
            head=temp;
        }
        else
        {
            temp.next=head;
            head=temp;
        }
    }
    void ILast(int val)
    {
        Node temp=head;
        while(temp!=null)
        {
            if(temp.next==null)
            {
                Node z =new Node(val);
                temp.next=z;
            }
        }
    }
    
}
class Node
{
    int data;
    Node next;    
    Node(int data1)
    {
        this.data=data1;
        this.next=null;
    }
}