import java.util.*;
class LinkedList4
{
    //Insert
    void Insertb4Start(int val)
    {
        Node start =new Node(1);
        Node x1 =new Node(val,start);
        System.out.println(x1.data +" "+ x1.next.data);
    }   
    public static void main(String args[])
    {
        LinkedList4 obj =new LinkedList4();
        obj.Insertb4Start(3);
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