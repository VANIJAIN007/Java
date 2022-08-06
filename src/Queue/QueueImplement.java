package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImplement
{
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<5;i++)
        {
            q.add(i);
        }
        System.out.println(q);
        q.remove();
        System.out.println(q);
        int head=q.peek();
        System.out.println(head);
        System.out.println(q);

    }

}
