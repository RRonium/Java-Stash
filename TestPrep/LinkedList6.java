import java.util.*; 
class LinkedList6
{
    Node head=null;
    void insertFront(int val)
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
    void insertEnd(int val)
    {
        Node mover;        
        Node temp =new Node(val);
        if(head==null)
        {
            head=temp;
        }
        else
        {
            for(mover=head;mover.next!=null;mover=mover.next);
            mover.next=temp;
        }
    }
    void insertMid(int val, int pos)
    {
        Node temp =new Node(val);
        Node mover=head;
        int c=1;
        for(int i=1;i<pos;i++)
        {
            if(mover==null)
                System.out.println("Not Possible");
        }
        while(c<pos)
        {            
            mover=mover.next;
            c++;
        }
        temp.next=mover.next;
        mover.next=temp;
    }
    void deleteFront()
    {
        if(head==null)
            System.out.println("UnderFlow");
        else
        {
            head=head.next;
        }
    }
    void deleteEnd()
    {
        Node mover=head;
        if(head==null || head.next==null)
        {
            while(mover.next.next!=null)
            {
                mover=mover.next;
            }
            mover.next=null;
        }
    }
    void deleteMid(int pos)
    {
        Node mover1=head,mover2=head;
        int c=1;
        while(c<pos)
        {
            mover1=mover2;
            mover2=mover2.next;
            c++;            
        }
        mover1.next=mover2.next;
        mover1=null;
        mover2=null;
    }
    void merge(Node head1, Node head2)
    {
        Node mover=head1;
        while(mover.next!=null)
        {
            mover=mover.next;
        }
        mover.next=head2;
    }    
    Node reversal_arr()
    {
        //Finding length of LL
        int length=0;
        Node temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            length++;
        }
        //Converting to array and reversing
        Node mover=head;
        int arr[] =new int[length];
        int rev[] =new int[length];
        for(int i=0;i<length;i++)
        {
            arr[length-i-1]=mover.data;
            mover=mover.next;   
        }        
        //Converting Array to LL
        Node reversed =new Node(arr[0]);
        mover=head;
        for(int i=1;i<length;i++)
        {
            temp =new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return reversed;
    }
    Node reversal(Node list)
    {
        LinkedList6 L1 =new LinkedList6();
        for(Node mover=list;mover!=null;mover=mover.next)
        {
            L1.insertFront(mover.data);
        }
        return L1.head;
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        
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