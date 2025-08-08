
import java.util.Collections;
import java.util.PriorityQueue;

public class Lexographical 
{
    public static void main(String[] args) 
    {
        PriorityQueue<String> pq=new PriorityQueue<>();
        pq.add("abs");
        pq.add("qwer");
        pq.add("dharaneesh");
        pq.add("abdul");
        System.out.println(pq);

        PriorityQueue<String> ppq=new PriorityQueue<>(Collections.reverseOrder());
        ppq.add("abs");
        ppq.add("qwer");
        ppq.add("dharaneesh");
        ppq.add("abdul");
        System.out.println(ppq);
    }    
}
