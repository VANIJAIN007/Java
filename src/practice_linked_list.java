/*
public class practice_linked_list

{
    private ListNode head;
    private static class ListNode
    {
        private ListNode next;
        private int data;
        public ListNode(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public static void main(String[] args) {
        practice_linked_list pll=new practice_linked_list();
        pll.head=new ListNode(10);
        ListNode second=new ListNode(12);
        ListNode third=new ListNode(14);
        ListNode fourth=new ListNode(15);
        pll.head.next=second;
        second.next=third;
        third.next=fourth;
        pll.display();
        System.out.println();
        System.out.println("---------");
        pll.insertLast(10);
        pll.inserTFirst(5);
        pll.display();
        System.out.println();
        System.out.println("-----");
        pll.deleleFirst();
        pll.display();
        System.out.println();
        pll.deleteLast();
        pll.display();
        System.out.println();
        pll.deleteLast();
        pll.display();
        System.out.println();
        System.out.println(pll.length());
        System.out.println();
        pll.insert(2,7);
        pll.display();
        System.out.println();
        pll.delete(4);
        pll.display();
        System.out.println();
        pll.insert(4,5);
        pll.insert(5,5);
        pll.display();
        System.out.println();
        pll.insert(2,7);
        pll.display();
        System.out.println();
        pll.removeDuplicates();
        pll.display();




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
    public void inserTFirst(int value)
    {
        ListNode newNode =new ListNode(value);
        newNode.next=head;
        head=newNode;

    }
    public void insertLast(int value)
    {
        ListNode newNode=new ListNode(value);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            ListNode current=head;
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=newNode;
            newNode.next=null;
        }
    }
    public ListNode deleleFirst()
    {
        if(head==null)
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
        if(head==null||head.next==null)
        {
            return head;
        }
        ListNode current=head;
        while(current.next.next!=null)
        {
            current=current.next;
        }
        current.next=null;
        return current;
    }
    public int length()
    {
        int count=0;
        ListNode current = head;
        while(current!=null)
        {
            count++;
            current=current.next;
        }
        return count;
    }
    public void insert(int position,int value)
    {
        ListNode newNode = new ListNode(value);
        if(position==1)
        {
            newNode.next=head;
            head= newNode;
        }
        else
        {
            ListNode previous=head;
            int count=1;
            while(count<position-1){
                previous=previous.next;
                count++;
            }
            ListNode current=previous.next;
            previous.next=newNode;
            newNode.next=current;
        }
    }
    public ListNode delete(int position)
    {
        if(position==1)
        {
            ListNode temp=head;
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
    public void removeDuplicates()
    {
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
    public ListNode insertInSortedList(int data)
    {
        ListNode newNode =new ListNode(data);
        ListNode current=head;
        ListNode temp=null;
        while (current!=null && current.data< newNode.data)
        {
            temp=current;
            current=current.next;
        }
        newNode.next=current;
        temp.next=newNode;
        return head;
    }

}

 */

/*
public class practice_linked_list
{
    private ListNode head;
    private ListNode tail;
    private int length;
    private static class ListNode
    {
        private int data;
        private ListNode next;
        private ListNode previous;
        public ListNode(int data)
        {
            this.data=data;
        }


    }
    public practice_linked_list()
    {
        this.head=null;
        this.tail=null;
        this.length=0;
    }
    public boolean isEmpty()
    {
        return length==0;
    }

    public static void main(String[] args) {
        practice_linked_list pll=new practice_linked_list();
        pll.insertFirst(5);
        pll.insertFirst(9);
        pll.insertLast(10);

        pll.displayForward();
        pll.insertLast(10);
        System.out.println();
        pll.displayBackward();
        System.out.println("After first deletion");
        pll.deleteFirst();
        pll.displayForward();



    }
    public void insertFirst(int data)
    {
        ListNode newNode =new ListNode(data);

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
    public void insertLast(int data)
    {
        ListNode newNode=new ListNode(data);
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
    public void displayForward()
    {
        if(head==null)
        {
            return;
        }
        ListNode current=head;
        while(current!=null)
        {
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.print("null");
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
    public ListNode deleteFirst()
    {
        ListNode temp=head;

        if(head==null)
        {
            throw new NullPointerException();
        }
        else
        {
            head=head.next;
            head.previous=null;
            temp.next=null;
        }
        return temp;
    }
    public ListNode deleteLast()
    {
        ListNode temp=head;

        if(isEmpty())
        {
            return head;
        }
        else
        {
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
            temp.next=null;


        }
        return temp;
    }


}*/

/*
import java.util.*;
class Main{
    public static class LinkedList {
        private static class Node {
            int data;
            Node next;

            Node(int data, Node next) {
                this.data = data;
                this.next = next;
            }
        }

        private Node head;
        private Node tail;
        private int size;

        public LinkedList() {
            this.head = null;
            this.tail = null;
            this.size = 0;
        }

        public LinkedList(Node head, Node tail, int size) {
            this.head = head;
            this.tail = tail;
            this.size = size;
        }

        // O(1)
        public int size() {
            return this.size;
        }

        // O(1)
        public boolean isEmpty() {
            return this.size() == 0;
        }

        // O(1)
        public int getFirst() throws Exception {
            if (this.isEmpty()) {
                throw new Exception("List is empty.");
            }

            return this.head.data;
        }

        // O(1)
        public int getLast() throws Exception {
            if (this.isEmpty()) {
                throw new Exception("List is empty.");
            }

            return this.tail.data;
        }

        // O(N)
        public int getAt(int idx) throws Exception {
            Node temp = this.getNodeAt(idx);
            return temp.data;
        }

        // O(N)
        private Node getNodeAt(int idx) throws Exception {
            if (this.isEmpty()) {
                throw new Exception("List is empty");
            }

            if (idx < 0 || idx >= this.size()) {
                throw new Exception("Invalid arguments");
            }

            Node retVal = this.head;
            for (int i = 0; i < idx; i++) {
                retVal = retVal.next;
            }

            return retVal;
        }

        // O(1)
        public void addFirst(int data) {
            Node node = new Node(data, this.head);

            if (this.size() == 0) {
                this.head = node;
                this.tail = node;
            } else {
                this.head = node;
            }

            this.size++;
        }

        // O(1)
        public void addLast(int data) {
            Node node = new Node(data, null);

            if (this.size() == 0) {
                this.head = node;
                this.tail = node;
            } else {
                this.tail.next = node;
                this.tail = node;
            }

            this.size++;
        }

        // O(n)
        public void addAt(int idx, int data) throws Exception {
            if (idx < 0 || idx > this.size()) {
                throw new Exception("Invalid arguments");
            }

            if (idx == 0) {
                this.addFirst(data);
            } else if (idx == this.size()) {
                this.addLast(data);
            } else {
                Node nm1 = this.getNodeAt(idx - 1);
                Node n = nm1.next;

                Node node = new Node(data, n);
                nm1.next = node;
                this.size++;
            }
        }

        // O(1)
        public int removeFirst() throws Exception {
            if (this.isEmpty()) {
                throw new Exception("List is empty");
            }

            int retVal = this.head.data;

            if (this.size() == 1) {
                this.head = null;
                this.tail = null;
            } else {
                this.head = this.head.next;
            }

            this.size--;
            return retVal;
        }

        // O(n)
        public int removeLast() throws Exception {
            if (this.isEmpty()) {
                throw new Exception("List is empty");
            }

            int retVal = this.tail.data;

            if (this.size() == 1) {
                this.head = null;
                this.tail = null;
            } else {
                Node sm2 = this.getNodeAt(this.size() - 2);
                sm2.next = null;
                this.tail = sm2;
            }

            this.size--;
            return retVal;
        }

        // O(n)
        public int removeAt(int idx) throws Exception {
            if (this.isEmpty()) {
                throw new Exception("List is empty");
            }

            if (idx < 0 || idx >= this.size()) {
                throw new Exception("Invalid arguments");
            }

            if (idx == 0) {
                return this.removeFirst();
            } else if (idx == this.size() - 1) {
                return this.removeLast();
            } else {
                Node nm1 = this.getNodeAt(idx - 1);
                Node n = nm1.next;
                Node np1 = n.next;

                nm1.next = np1;
                this.size--;

                return n.data;
            }
        }

        // O(n)
        public void display() {
            Node node = this.head;

            while (node != null) {
                System.out.print(node.data + " ");
                node = node.next;
            }

            //System.out.println("END");
        }
    }
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);


        int test = scn.nextInt();

        for (int i = 0; i < test; i++) {
            LinkedList list1 = new LinkedList();
            LinkedList list2 = new LinkedList();
            int size1 = scn.nextInt();

            for (int i1 = 0; i1 < size1; i1++) {
                list1.addAt(i1, scn.nextInt());
            }

            int size2 = scn.nextInt();

            for (int i1 = 0; i1 < size2; i1++) {
                list2.addAt(i1, scn.nextInt());
            }
            mergeLists(list1.head, list2.head);
        }
    }

    private static void reverse()
    {

    }
}*/

/*
import java.util.*;
class Main {
    public static class LinkedList {

        private static class Node {
            int data;
            Node next;

            Node(int data, Node next) {
                this.data = data;
                this.next = next;
            }
        }

        private static Node head;
        private Node tail;
        private int size;

        public LinkedList() {
            this.head = null;
            this.tail = null;
            this.size = 0;
        }

        public LinkedList(Node head, Node tail, int size) {
            this.head = head;
            this.tail = tail;
            this.size = size;
        }

        // O(1)
        public int size() {
            return this.size;
        }

        // O(1)
        public boolean isEmpty() {
            return this.size() == 0;
        }

        // O(1)
        public int getFirst() throws Exception {
            if (this.isEmpty()) {
                throw new Exception("List is empty.");
            }

            return this.head.data;
        }

        // O(1)
        public int getLast() throws Exception {
            if (this.isEmpty()) {
                throw new Exception("List is empty.");
            }

            return this.tail.data;
        }

        // O(N)
        public int getAt(int idx) throws Exception {
            Node temp = this.getNodeAt(idx);
            return temp.data;
        }

        // O(N)
        private Node getNodeAt(int idx) throws Exception {
            if (this.isEmpty()) {
                throw new Exception("List is empty");
            }

            if (idx < 0 || idx >= this.size()) {
                throw new Exception("Invalid arguments");
            }

            Node retVal = this.head;
            for (int i = 0; i < idx; i++) {
                retVal = retVal.next;
            }

            return retVal;
        }

        // O(1)
        public void addFirst(int data) {
            Node node = new Node(data, this.head);

            if (this.size() == 0) {
                this.head = node;
                this.tail = node;
            } else {
                this.head = node;
            }

            this.size++;
        }

        // O(1)
        public void addLast(int data) {
            Node node = new Node(data, null);

            if (this.size() == 0) {
                this.head = node;
                this.tail = node;
            } else {
                this.tail.next = node;
                this.tail = node;
            }

            this.size++;
        }

        // O(n)
        public void addAt(int idx, int data) throws Exception {
            if (idx < 0 || idx > this.size()) {
                throw new Exception("Invalid arguments");
            }

            if (idx == 0) {
                this.addFirst(data);
            } else if (idx == this.size()) {
                this.addLast(data);
            } else {
                Node nm1 = this.getNodeAt(idx - 1);
                Node n = nm1.next;

                Node node = new Node(data, n);
                nm1.next = node;

                this.size++;
            }
        }

        // O(1)
        public int removeFirst() throws Exception {
            if (this.isEmpty()) {
                throw new Exception("List is empty");
            }

            int retVal = this.head.data;

            if (this.size() == 1) {
                this.head = null;
                this.tail = null;
            } else {
                this.head = this.head.next;
            }

            this.size--;
            return retVal;
        }

        // O(n)
        public int removeLast() throws Exception {
            if (this.isEmpty()) {
                throw new Exception("List is empty");
            }

            int retVal = this.tail.data;

            if (this.size() == 1) {
                this.head = null;
                this.tail = null;
            } else {
                Node sm2 = this.getNodeAt(this.size() - 2);
                sm2.next = null;
                this.tail = sm2;
            }

            this.size--;
            return retVal;
        }

        // O(n)
        public int removeAt(int idx) throws Exception {
            if (this.isEmpty()) {
                throw new Exception("List is empty");
            }

            if (idx < 0 || idx >= this.size()) {
                throw new Exception("Invalid arguments");
            }

            if (idx == 0) {
                return this.removeFirst();
            } else if (idx == this.size() - 1) {
                return this.removeLast();
            } else {
                Node nm1 = this.getNodeAt(idx - 1);
                Node n = nm1.next;
                Node np1 = n.next;

                nm1.next = np1;
                this.size--;

                return n.data;
            }
        }

        // O(n)
        public void display() {
            Node node = this.head;

            while (node != null) {
                System.out.print(node.data + " ");
                node = node.next;
            }

            //System.out.println("END");
        }
    }


    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        //int M = scn.nextInt();


        LinkedList list = new LinkedList();

        for (int i = 0; i < N; i++) {
            list.addLast(scn.nextInt());
        }

        list.reverse_DI();
        list.display();

}
    public static void reverse_DI() {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;

        }
        return;
    }

}




*/

//public class practice_linked_list
//{
//    public static void main(String[] args) {
//        int arr[]=new int[15];
//        countbinarydigit(arr);
//    }
//    public static void countbinarydigit(int[] arr)
//{
//    for(int i=0;i<arr.length;i++)
//    {
//        int n=arr[i];
//        int rem=
//    }
//}
//}
