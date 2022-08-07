package practice_GFG_programs;

public class GetNthNode
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
        GetNthNode obj=new GetNthNode();
        obj.insert(1,5);
        obj.insert(2,7);
        obj.insert(3,10);
        obj.display();
        System.out.println(obj.getN(2));
        System.out.println();
        System.out.println("Recursion");
        System.out.println(obj.getRec());

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
    public void display()
    {
        ListNode current=head;
        while(current!=null)
        {
            System.out.print(current.data);
            current=current.next;

        }
        System.out.print("null");
    }
    //Iterative
    public int getN(int index)
    {
        ListNode current=head;
        int count=0;
        while(current!=null)
        {
            if(count==index)
            {
                return current.data;
            }
            else
            {
                count++;
                current=current.next;
            }
        }
        assert(false);
        return -1;
    }
    //Recursive
    public int getNRec(int index,ListNode current)
    {
        int count=0;
        if(current==null)
        {
            return -1;
        }
        if(count==index)
        {
            return current.data;
        }
        else
        {
            return getNRec(index-1,current.next);
        }
    }
    public int getRec()
    {
        return getNRec(1,head);
    }
}
