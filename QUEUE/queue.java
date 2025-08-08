import java.util.*;
public class queue 
{
    public static void main(String[] args) 
    {
        Queue<Integer> queue=new LinkedList<>();
        
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        queue.poll();
        while(!queue.isEmpty())
        {
            System.out.println(queue.poll());
        }
    }
    
}
