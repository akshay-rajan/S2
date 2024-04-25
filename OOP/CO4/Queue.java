// 13. Program to demonstrate the creation of queue object using the PriorityQueue class

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;


public class Queue {

    public static void main(String[] args) {
        
        // Creation
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Insertion
        minHeap.add(3);
        minHeap.add(2);
        minHeap.add(6);
        minHeap.add(1);
        minHeap.add(7);
        
        maxHeap.add(2);
        maxHeap.add(3);
        maxHeap.add(6);
        maxHeap.add(1);
        maxHeap.add(7);

        // Return the top element (smallest by default)
        System.out.println("Top of min heap: " + minHeap.peek());
        System.out.println("Top of max heap: " + maxHeap.peek());
        
        // Printing the top element and removing it from the PriorityQueue
        System.out.println("Removing " + minHeap.poll());
        System.out.println("Removing " + maxHeap.poll());
        
        System.out.println("New Top of min heap: " + minHeap.peek());
        System.out.println("New Top of max heap: " + maxHeap.peek());
        

    }

}
