//"next is used to traverse throught the LL"
import java.util.*;
class LinkedList3
{
    void callingLL(int arr[])
    {        
        Node x1 =new Node(arr[3]);
        System.out.println(x1.data);
    }
    Node ArraytoLL(int arr[])
    {
        Node head =new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++)
        {
            Node temp =new Node(arr[i]);
            mover.next=temp;            //fillsup the "next boxes"
            mover=mover.next;            
        }
        return head;            //returning the head of the linked list means that u now have the starting point which like a chain will point to the whole LL. So, technically if u have the head....u have the LL
    }
    void LengthofLL(Node head)
    {
        int flag=0;
        Node temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            flag++;
        }
        System.out.println(flag);
    }
    void traversal(int arr[])
    {
        Node head =ArraytoLL(arr); //U must conver Array to LL in order to traverse thru LL!
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+", ");
            temp=temp.next;
        }
    }
    public static void main(String args[])
    {
        int arr[] ={2,1,5,6,7};
        LinkedList3 obj =new LinkedList3();
        //obj.callingLL(arr);
        obj.ArraytoLL(arr);
        Node head = obj.ArraytoLL(arr);
        //obj.LengthofLL(head);
        //obj.traversal(arr);
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