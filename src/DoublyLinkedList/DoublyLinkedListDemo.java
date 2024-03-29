package DoublyLinkedList;

import java.util.NoSuchElementException;

public class DoublyLinkedListDemo
{
        private ListNode head;
        private ListNode tail;
        private int length;
        private class ListNode
        {
            private int data;
            private ListNode next;
            private ListNode previous;

            public ListNode(int data)
            {
                this.data=data;
            }
        }
        public DoublyLinkedListDemo()
        {
            this.head=null;
            this.tail=null;
            this.length=0;
        }
        public boolean isEmpty()
        {
            return length==0;// or head==null
        }

    public static void main(String[] args) {
        DoublyLinkedListDemo dll=new DoublyLinkedListDemo();
        dll.insertFirst(1);
        dll.insertFirst(10);
        dll.insertEnd(5);
        dll.displayBackward();
        dll.displayForward();
    }

        public void insertFirst(int value)
        {
            ListNode newNode=new ListNode(value);
                if(isEmpty())
                {
                    tail=newNode;
                }
                else
                {
                    head.previous=newNode;
                }
                newNode.next=head;
                head=newNode;
                length++;
            }

        //to insert nodes

    public void insertEnd(int value)
    {
        ListNode newNode=new ListNode(value);
        if(isEmpty())
        {
            head=newNode;
        }
        else
        {
            tail.next=newNode;
            newNode.previous=tail;
        }
        tail=newNode;
        length++;

    }

    //how to print elements
    public void displayForward()
    {
        if(head==null)
        {
            return;
        }

        ListNode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void displayBackward()
    {
        if(head==null)
        {
            return;
        }
        ListNode temp=tail;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.previous;
        }
        System.out.print("null");
    }
    
    //how to delete firstnode
    public ListNode deleteFirst()
    {
        if(isEmpty())
        {
            throw new NoSuchElementException();
        }
        ListNode temp=head;
        if(head==tail)
        {
            tail=null;
        }
        else
        {
            head.next.previous=null;
        }
        head=head.next;
        temp.next=null;
        length--;
        return temp;
    }
}
