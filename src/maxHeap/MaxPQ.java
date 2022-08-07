package maxHeap;

public class MaxPQ
{
    Integer[] heap;
    int n;
    public MaxPQ(int capacity)
    {
        heap=new Integer[capacity+1];
        n=0;
    }
    public boolean isEmpty()
    {
        return n==0;
    }
    public int size()
    {
        return n;
    }

    public static void main(String[] args) {
        MaxPQ pq=new MaxPQ(3);
        System.out.println(pq.size());
        System.out.println(pq.isEmpty());
    }
    //Bottom-Up Reheapify Max Heap

    //After inserting an element ito heap.It may not satisfy th e heap property
    //We adjust the locations to satisfy
}
