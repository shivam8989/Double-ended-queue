package Queues;

import java.util.Deque;
import java.util.LinkedList;

public class Double_Ended_Queue {
    public static void main(String args []){
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        System.out.println(deque);

    }
}
