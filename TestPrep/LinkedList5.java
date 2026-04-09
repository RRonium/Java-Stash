import java.util.*;
class LinkedList5
{
    Node head=null;
    void develop(int val)
    {
        Node temp =new Node(val);
        temp.next=head;
        head=temp;
    }
    void display()
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
        Scanner sc =new Scanner(System.in);
        LinkedList5 obj =new LinkedList5();
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter element: ");
            obj.develop(sc.nextInt());
        }
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