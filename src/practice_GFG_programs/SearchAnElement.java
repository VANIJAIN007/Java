package practice_GFG_programs;

public class SearchAnElement
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
        SearchAnElement obj=new SearchAnElement();
        obj.insert(1,5);
        obj.insert(2,7);
        obj.insert(3,10);
        obj.display();
        System.out.println(obj.search(7));
        System.out.println(obj.search(9));

    }
    public void insert(int position,int data)
    {
        ListNode newNode =new ListNode(data);
        if(position==1)
        {
            newNode.next=head;
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
    public int search(int x)
    {
        ListNode current=head;
        if(head==null)
        {
            return 0;
        }
        else
        {
            while(current!=null)
            {
                if(current.data==x)
                {
                    System.out.println();
                    System.out.println("Element is found");
                    return current.data;
                }
                else
                {
                    current=current.next;
                }
            }
            return -1;
        }

    }
}
