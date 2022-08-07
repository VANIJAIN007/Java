
package Linked_List;

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
    public void display()
    {
        ListNode current=head;
        while(current!=null)
        {
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        SinglyLinkedList sll=new SinglyLinkedList();
        sll.head=new ListNode(10);
        ListNode second=new ListNode(1);
        ListNode third=new ListNode(8);
        ListNode fourth=new ListNode(11);
        sll.head.next=second;
        second.next=third;
        third.next=fourth;
        sll.display();
        System.out.println("Length is ->"+sll.length());
       /* sll.insertFirst(11);
        sll.insertFirst(8);
        sll.insertFirst(1);
        sll.display();*/
        /*sll.insertLast(11);
        sll.insertLast(8);
        sll.insertLast(1);
        sll.display();*/
        /*
        sll.insertFirst(11);
        sll.insertFirst(8);
        sll.insertFirst(1);
        sll.insertFirst(10);
        sll.display();
        System.out.println(sll.DeleteFirst().data);
        System.out.println(sll.DeleteFirst().data);
        sll.display();
        */
        /*
        sll.insertLast(11);
        sll.insertLast(8);
        sll.display();
        System.out.println(sll.deleteLast().data);
        System.out.println(sll.deleteLast().data);

         */
        /*
        sll.insert(1,3);
        sll.insert(2,5);
        sll.insert(1,2);
        sll.insert(2,4);
        sll.display();
        */
        /*
        sll.insert(1,4);
        sll.insert(2,5);
        sll.insert(3,7);
        sll.insert(2,5);
        */
        /*
        sll.insertFirst(3);
        sll.insertFirst(3);
        sll.insertFirst(2);
        sll.insertFirst(1);
        sll.insertFirst(1);
        sll.display();
        sll.removeDuplicates();
        sll.display();
        */

        sll.InsertInSortedList(11);
        sll.display();
        System.out.println();
        sll.removeDuplicates();
        sll.display();


    }

    public int length()
    {
        if(head==null)
        {
            return 0;
        }
        int count=0;
        ListNode current=head;
        while(current!=null)
        {
            count++;
            current=current.next;
        }
        return count;

    }
    public void insertFirst(int value)
    {
        ListNode newNode=new ListNode(value);
        newNode.next=head;
        head=newNode;
    }

    public void insertLast(int value)
    {
        ListNode newNode=new ListNode(value);
        if(head==null)
        {
            head=newNode;
            return;
        }
        ListNode current=head;
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=newNode;
    }
    public ListNode DeleteFirst()
    {
        if(head==null)
        {
            return null;
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
        ListNode current=head;
        ListNode previous=null;
        while(current.next!=null)
        {
            previous=current;
            current=current.next;
        }
        previous.next=null;
        return current;
    }
    public void insert(int position,int value)
    {
        ListNode node=new ListNode(value);
        if(position==1)
        {
            node.next=head;
            head=node;
        }
        else
        {
            ListNode previous=head;
            int count=1;
            while(count<position-1)
            {
                previous=previous.next;
                count++;
            }
            ListNode current=previous.next;
            previous.next=node;
            node.next=current;

        }
    }
    public void delete(int position)
    {
        if(position==1)
        {
            head=head.next;

        }
        else
        {
            ListNode previous=head;
            int count=1;
            while(count<position-1)
            {
                previous=previous.next;
                count++;
            }
            ListNode current=previous.next;
            previous.next=current.next;

        }
    }
/*
    public ListNode getNthNodeFromEnd(int n) {
        if (head == null) {
            return null;
        }
        if (n <= 0) {
            throw new IllegalArgumentException(("Invalid value:,=" + n));
        }
        ListNode mainptr = head;
        ListNode refptr = head;
        int count = 0;

        while (count < n) {
            if (refptr == null) {
                throw new IllegalArgumentException(n + "is greater than the no. of nodes in lits");
                refptr = refptr.next;
                count++;
            }
            while (refptr != null) {
                refptr = refptr.next;
                mainptr = mainptr.next;
            }
            return mainptr;
        }




    }
    */
        public void removeDuplicates()
        {
            if(head==null)
            {
                return;
            }
            ListNode current=head;
            while(current!=null && current.next!=null)
            {
                if(current.data==current.next.data)
                {
                    current.next=current.next.next;
                }
                else
                {
                    current=current.next;
                }
            }

        }

        //how to insert node in a sorted list
            public ListNode InsertInSortedList(int value) {
                ListNode newNode = new ListNode(value);
                if (head == null) {
                    return newNode;
                }
                ListNode current = head;
                ListNode temp = null;
                while (current != null && current.data < newNode.data) {
                    temp = current;
                    current = current.next;
                }
                newNode.next = current;
                temp.next = newNode;
                return head;
            }


    }




