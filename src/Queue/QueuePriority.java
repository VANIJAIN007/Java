package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePriority
{
    public static void main(String[] args) {
        Queue<String> pq=new PriorityQueue<>();
        pq.add("dnekwfj");
        pq.add("kejk");
        pq.add("eknck");

        System.out.println(pq);
        pq.remove();
        System.out.println(pq);
    }
}
