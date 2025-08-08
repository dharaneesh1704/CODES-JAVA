
import java.util.Collections;
import java.util.PriorityQueue;

class priorityQueue
{
    public static void main(String[] args) 
    {
        //min heap -- smallest on the top
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        queue.add(10);
        queue.add(1);
        queue.add(5);
        queue.add(7);
        queue.add(1);
        System.out.println("min heap : "+queue);

        //max heap -- biggest on the top
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        pq.add(10);
        pq.add(1);
        pq.add(5);
        pq.add(7);
        pq.add(1);
        System.out.println("max heap : "+pq);
    }
}