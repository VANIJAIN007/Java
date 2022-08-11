package LinkedListPractice;
/*
package LinkedListPractice;

public class SinglyLinkedList
{
    private ListNode head;
    private static class ListNode
    {
        private int data;
        private ListNode next;
        public ListNode(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        SinglyLinkedList sll=new SinglyLinkedList();
        sll.head=new ListNode(10);
        ListNode second =new ListNode(20);
        ListNode third=new ListNode(30);
        ListNode fourth=new ListNode(40);
        sll.head.next=second;
        second.next=third;
        third.next=fourth;
        sll.display();
        sll.insertFirst(5);
        sll.insertLast(50);
        sll.display();
        System.out.println(sll.length());

    }
    public ListNode insertFirst(int data)
    {
        ListNode newNode=new ListNode(data);
        newNode.next=head;
        head=newNode;

        return head;
    }
    public ListNode insertLast(int data)
    {
        ListNode newNode=new ListNode(data);
        if(head==null)
        {
            head=newNode;
            return head;
        }
            ListNode current=head;
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=newNode;

        return current;

    }
    public void display()
    {
        ListNode current=head;
        while(current!=null)
        {
            System.out.println(current.data);
            current=current.next;
        }
    }
    public int length()
    {
        int count=0;
        ListNode current=head;
        while(current!=null)
        {
            count++;
            current=current.next;
        }
        return count;
    }
    public ListNode insertPosition(int position,int data)
    {
        ListNode newNode=new ListNode(data);
        if(position==1)
        {
            newNode.next=head;
            head=newNode;
            return head;
        }
        else
        {
            ListNode previous=head;
            int count=1;
            while (count<position-1)
            {
                previous=previous.next;
                count++;
            }
            ListNode current=previous.next;
            previous.next=newNode;
            newNode.next=current;

            return current;


        }
    }
    */
/*public ListNode deleteFirst()
    {
        if(head==null|| head.next==null)
        {
            return head;
        }
        ListNode temp=head;
        head=head.next;
        temp.next=null;

        return temp;
    }
    public ListNode deleteLast()
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        else
        {
            ListNode current=head;
            while()
        }

    }
    *//*




}*/

public class SinglyLinkedList
{
    private ListNode head;
    private static class ListNode
    {
        private int data;
        private ListNode next;
        public ListNode(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
}


