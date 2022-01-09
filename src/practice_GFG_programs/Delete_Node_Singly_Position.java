package practice_GFG_programs;

import com.sun.source.tree.LiteralTree;

public class Delete_Node_Singly_Position
{
    private ListNode head;
    private static class ListNode
    {
        private int data;
        private ListNode next;
        public ListNode(int data)
        {
            this.data=data;
        }
    }

    public static void main(String[] args) {
        Delete_Node_Singly_Position dl=new Delete_Node_Singly_Position();
        dl.head=new ListNode(10);
        ListNode second=new ListNode(20);
        ListNode third=new ListNode(30);
        ListNode fourth=new ListNode(40);
        dl.head.next=second;
        second.next=third;
        third.next=fourth;
        dl.display();
        dl.insert(2,5);
        dl.display();
        System.out.println();
        dl.delete(2);
        System.out.println("After deletiiom");
        dl.display();


    }
    public void insert(int position,int data)
    {
        ListNode newNode=new ListNode(data);
        if(position==1)
        {
            newNode.next=head;
            head=newNode;
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
            previous.next=newNode;
            newNode.next=current;
        }
    }
    public void display(){
        ListNode current=head;
        while(current!=null)
        {
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.print("null");
    }
    public ListNode delete(int position)
    {
        ListNode temp=head;

        if(position==1)
        {
            head=head.next;
            temp.next=null;
            return temp;
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
            return previous;
        }
    }
}
