package practice_GFG_programs;

public class Recursive_Iterative_Length {
    private static ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Recursive_Iterative_Length ril = new Recursive_Iterative_Length();
        ril.insert(1, 7);
        ril.insert(2, 5);
        ril.insert(3, 8);
        ril.insert(4,10);
        ril.display();
        System.out.println();
        System.out.println("With recursive");
        System.out.println(ril.getCount());
        System.out.println("With iterative");
        System.out.println(ril.length());


    }

    public void insert(int position, int data) {
        ListNode newNode = new ListNode(data);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            int count = 1;
            ListNode previous = head;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = newNode;
            newNode.next = current;
        }
    }

    public int length() {
        ListNode current = head;
        int count = 0;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    public int getCountRec(ListNode current)
    {
        if(current==null)
        {
            return 0;
        }
        return 1+getCountRec(current.next);
    }
    public int getCount()
    {
        return getCountRec(head);
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
