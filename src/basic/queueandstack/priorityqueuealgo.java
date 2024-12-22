package basic.queueandstack;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityqueuealgo {
    public static void main(String[] args) {

        //First come first serve

//        Queue<Double> queue = new PriorityQueue<>();
//
//        queue.offer(3.0);
//        queue.offer(1.0);
//        queue.offer(5.0);
//        queue.offer(2.0);
//        queue.offer(4.0);
//
//        while (!queue.isEmpty()) {
//            System.out.println(queue.poll());
//        }

        Queue<Double> queue2 = new PriorityQueue<>(Collections.reverseOrder());

        queue2.offer(3.0);
        queue2.offer(1.0);
        queue2.offer(5.0);
        queue2.offer(2.0);
        queue2.offer(4.0);

        while (!queue2.isEmpty()) {
            System.out.println(queue2.poll());
        }

    }
}
