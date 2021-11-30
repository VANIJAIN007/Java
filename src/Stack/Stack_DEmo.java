package Stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class Stack_DEmo {
    //It is a Linear Data structure used for storing the data
    //It is an ordered list in which insertion and deletion are at one end,called top
    //Last in First Out

    //Implementing a Stack

    //Push
    private ListNode top;
    private int length;
    String str="ABCD";


    private class ListNode {
        private int data;//Can be a generic type
        private ListNode next;//Reference to next ListNode in list

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static void main(String[] args) {
        Stack_DEmo stack = new Stack_DEmo();
        stack.push(10);
        stack.push(15);
        stack.push(20);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());


    }


    public Stack()
    {
        top=null;
        length=0;
    }
    public int length()
    {
        return length;
    }
    public boolean isEmpty()
    {
        return length==0;
    }
    public void push(int data)
    {
        ListNode temp=new ListNode( data);
        temp.next=top;
        top=temp;
        length++;
    }
    public int peek()
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }
        return top.data;
    }
    public int pop()
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }
        int result=top.data;
        top=top.next;
        length--;
        return result;
    }
    public static String StringReverse(String str)
    {
        Stack<Character> stack=new Stack<>();
        char[] chars=str.toCharArray();
        for(char c:chars)
        {
            stack.push(c);
        }
        for (int i = 0; i < str.length(); i++) {
            chars[i]=stack.pop();

        }
        return new String(chars);
    }
}
