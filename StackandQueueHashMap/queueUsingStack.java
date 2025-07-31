package StackandQueueHashMap;
import java.util.Stack;

public class queueUsingStack {
    public static void main(String[] args) {
        Stack<Integer> enqueue = new Stack<>();
        Stack<Integer> dequeue = new Stack<>(); 

        // data sstore like  (bottom) 0->1->2->3->4->5 (top)
        enqueue.push(0);
        enqueue.push(1);
        enqueue.push(2);
        enqueue.push(3);
        enqueue.push(4);
        enqueue.push(5);
        
        while(!enqueue.isEmpty()){
            int a = enqueue.pop();
            dequeue.push(a);
        }

        while(!dequeue.isEmpty()){
            int a = dequeue.pop();
            System.out.println(a);
        }

    }
}
