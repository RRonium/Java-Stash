import java.util.*;
class LL4
{
    Node head=null;
    void insertF(int val)
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
    void insertE(int val)
    {
        Node temp =new Node(val);
        Node mover=head;
        for(;mover.next==null;mover=mover.next);                 
        mover.next=temp;
    }
    void insertM(int val, int pos)
    {
        Node temp =new Node(val);
        Node mover=head;
        int c=1;
        for(int i=1;i<pos;i++)
        {
            if(mover==null)
                System.out.println("Not possible");
        }
        while(c<pos)
        {
            mover=mover.next;
            c++;
        }
        temp.next=mover.next;
        mover.next=temp;
    }
    void delF()
    {
        if(head==null)
            System.out.println("Underflow");
        else
        {
            head=head.next;
        }
    }
    void delE()
    {
        Node mover;
        for(mover=head;mover.next.next!=null;mover=mover.next);     
        mover.next=null;        
    }
    void delM(int pos)
    {
        Node mover1=head, mover2=head;
        int c=1;
        while(c<pos)
        {
            mover1=mover2;
            mover2=mover2.next;
        }
        mover1.next=mover2.next;
        mover1=null;
        mover2=null;
    }
    void reversal(Node temp)
    {
        Node mover=null;
        for(;temp.next!=null;temp=temp.next)
        {
            if(mover==null)
            {
                mover=temp;
            }
            else
            {
                mover.next=mover;
                mover=temp;
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