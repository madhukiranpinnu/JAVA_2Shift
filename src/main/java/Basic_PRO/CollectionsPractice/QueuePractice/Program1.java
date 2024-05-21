package Basic_PRO.CollectionsPractice.QueuePractice;

import java.util.PriorityQueue;
import java.util.Queue;

public class Program1 {
    public static void main(String[] args) {
        Queue queue=new PriorityQueue();
        //In Queue we can add only one type of data if we use multiple datatypes we will get class cast exception
        //In Queue we cannot add null
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue);
        queue.offer(4);
        queue.offer(5);
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);
        queue.remove(2);
        System.out.println(queue);
    }
}
