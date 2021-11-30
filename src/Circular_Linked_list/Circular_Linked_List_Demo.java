package Circular_Linked_list;

import java.util.NoSuchElementException;

public class Circular_Linked_List_Demo
{
    //we keep track of last node not the head

    //CSLL is similar to sll with a difference that in CLL the last node points to the the first node not the null

    //implementation
    private ListNode last;
    private int length;

    private class ListNode
    {
        private ListNode next;
        private int data;

        public ListNode(int data)
        {
            this.data=data;
        }

    }

    public static void main(String[] args) {
        Circular_Linked_List_Demo cll=new Circular_Linked_List_Demo();
        cll.createCircularLinkedList();
        cll.display();
        cll.insertFirst(12);
        cll.display();
        cll.insertLast(2);
        cll.display();
    }
    public Circular_Linked_List_Demo()
    {
        last=null;
        length=0;
    }
    //brute force method
    public void createCircularLinkedList()
    {
        ListNode first= new ListNode(1);
        ListNode second=new ListNode(5);
        ListNode third=new ListNode(10);
        ListNode fourth=new ListNode(15);

        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=first;

        last=fourth;
    }

    //to traverse and print a circular Linked List

    public void display()
    {
        if(last==null)
        {
            return;
        }
        ListNode first=last.next;
        while(first!=last)
        {
            System.out.print(first.data+"->");
            first=first.next;

        }
        System.out.println(first.data);
    }
    //add node at start of circular linked list

    public void insertFirst(int data)
    {
        ListNode temp=new ListNode(data);
        if(last==null)
        {
            last=temp;

        }
        else
        {
            temp.next=last.next;

        }
        last.next=temp;
        length++;
    }

    //insert end at end of circular linked list

    public void insertLast(int data)
    {
        ListNode temp=new ListNode(data);
        if(last==null)
        {
            last=temp;
            last.next=last;
        }
        else
        {
            temp.next=last.next;
            last.next=temp;
            last=temp;
        }
        length++;

    }

    //remove the first node from a circular linked list
/*
    public ListNode removeFirst()
    {
        if(isEmpty())
        {
            throw new NoSuchElementException("Circular Singly Linked List is ALready empty");
        }
        ListNode temp=last.next;
        if(last.next==last)
        {
            last=null;

        }
        else
        {
            last.next=temp.next;
        }
        temp.next=null;
        length--;
        return temp;
    }

 */
}
