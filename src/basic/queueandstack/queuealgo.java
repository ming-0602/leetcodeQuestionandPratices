package basic.queueandstack;

import java.util.LinkedList;
import java.util.Queue;

public class queuealgo {
    public static void main(String[] args) {
        //First in first out
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        System.out.println(queue);

        queue.remove();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);

    }
}
