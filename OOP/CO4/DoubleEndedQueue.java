// 14. Program to demonstrate the addition and deletion of elements in deque

import java.util.ArrayDeque;
import java.util.Deque;


public class DoubleEndedQueue {
    
    public static void main(String[] args) {
        
        Deque<Integer> dq = new ArrayDeque<>();
        
        dq.addFirst(100);
        System.out.println(dq);
        dq.addLast(200);
        System.out.println(dq);
        dq.addFirst(0);
        System.out.println(dq);

        dq.removeFirst();
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);

    }
    
}
