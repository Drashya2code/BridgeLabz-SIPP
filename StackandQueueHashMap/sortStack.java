package StackandQueueHashMap;

import java.util.Stack;

public class sortStack {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
    st.push(0);
    st.push(9);
    st.push(10);
    st.push(5);
    st.push(1);
    sort(st);
    System.out.println(st);
    }

    public static void sort(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            sort(stack);
            insertSorted(stack, temp);
        }
    }

    private static void insertSorted(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || element > stack.peek()) {
            stack.push(element);
        } else {
            int temp = stack.pop();
            insertSorted(stack, element);
            stack.push(temp);
        }
    }
}
