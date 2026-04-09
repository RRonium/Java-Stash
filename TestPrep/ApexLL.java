class ApexLL
{
    static Node concat(Node head1, Node head2) 
    {
        if (head1 == null) 
            return head2;     
        Node curr = head1;
        while (curr.next != null) 
        {
            curr = curr.next;
        }
        curr.next = head2;
        return head1;
    }
    static void printList(Node curr) 
    {
        while (curr != null)
        {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {        
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        Node head2 = new Node(4);
        head2.next = new Node(5);
        Node concatHead = concat(head1, head2);
        printList(concatHead);
    }
}
class Node {
    int data;
    Node next;
    Node(int x){
        this.data = x;
        this.next = null;
    }
}
