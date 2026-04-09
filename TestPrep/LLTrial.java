import java.util.*;
class LLTrial
{
    Node Develop()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter "+"1"+" no. element:");
        int val=sc.nextInt();
        Node head =new Node(val);
        Node mover=head;
        for(int i=2;i<=5;i++)
        {
            System.out.println("Enter "+i+" no. element:");
            val=sc.nextInt();
            Node temp =new Node(val);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    void display(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+", ");
            temp=temp.next;
        }
    }
    public static void main(String args[])
    {
        LLTrial obj =new LLTrial();
        obj.display(obj.Develop());
    }
}
class Node
{
    int data;
    Node next;    
    Node(int data1, Node next1)
    {
        this.data=data1;
        this.next=next1;
    }
    Node(int data1)
    {
        this.data=data1;
        this.next=null;
    }
}