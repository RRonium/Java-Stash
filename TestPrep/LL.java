import java.util.*;
class LL
{
    Node head;
    void develop(int val)
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
    void display()
    {
        for(Node ctr=head;ctr!=null;ctr=ctr.next)
            System.out.println(ctr.data+", ");
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        LL list1 =new LL();
        for(int i=0;i<5;i++)
        {
            list1.develop(sc.nextInt());
        }
        list1.display();
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