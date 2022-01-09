package practice_GFG_programs;

public class deleteList
{
    private ListNode head;
    private static class ListNode
    {
        private ListNode next;
        private int data;
        public ListNode(int data)
        {
            this.data=data;
        }
    }

    public static void main(String[] args) {
        deleteList dl=new deleteList();
        dl.head=new ListNode(10);
        dl.insert(1,4);
        dl.insert(2,7);
        dl.insert(3,10);
        dl.display();
        System.out.println();
        System.out.println("Deleting the list");
        dl.delete_list();
        System.out.println("List delete");



    }
    public void insert(int position,int data)
    {
        ListNode newNode=new ListNode(data);
        if(position==1)
        {
            newNode.next=head;
            head=head.next;
            head=newNode;
        }
        else
        {
            int count=1;
            ListNode previous=head;
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
    public void delete_list()
    {
        head=null;
    }
    public void display()
    {

            ListNode current=head;
            while(current!=null)
            {
                System.out.print(current.data+"->");
                current=current.next;
            }
            System.out.print("null");





    }
}
