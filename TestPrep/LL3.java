import java.util.*;
class LL3
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
        if(head==null)
        {
            head=temp;
        }
        else
        {
            while(mover.next!=null)
            {
                mover=mover.next;
            }
            mover.next=temp;
        }
    }
    void insertM(int pos, int val)
    {
        Node mover=head;
        Node temp =new Node(val);
        for(int i=1;i<pos;i++)
        {
            if(mover==null)
            {
                System.out.println("Underflow");
                return;
            }
        }
        for(int i=2;i<pos;i++)
        {
            mover=mover.next;
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
        if(head==null)
            System.out.println("Not possible");
        else
        {
            Node mover;
            for(mover=head;mover.next!=null;mover=mover.next);
            mover=null;
        }
    }
    void delM(int pos, int val)
    {
        Node mover=head;
        Node temp =new Node(val);
        for(int i=0;i<pos;i++)
        {
            
        }            
    }
    void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+", ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        LL3 obj =new LL3();
        System.out.println("How long?: ");
        int lim=sc.nextInt(),val,pos;
        for(int i=0;i<lim;i++)
        {
            val=sc.nextInt();
            obj.insertE(val);
        }
        obj.display();
        System.out.println("Enter position and value:");
        obj.insertM(sc.nextInt(),sc.nextInt());
        obj.display();
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