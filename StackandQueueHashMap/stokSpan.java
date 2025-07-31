package StackandQueueHashMap;

import java.util.ArrayList;
import java.util.Stack;

public class stokSpan {
    public static void main(String[] args) {
        int[] stock = {100, 80, 60, 70, 60, 75, 85};
        ArrayList<Integer> span = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        st.push(0);
        span.add(1);
        for (int i = 1; i < stock.length; i++) {
            while (!st.isEmpty() && stock[st.peek()] <= stock[i]) {
                st.pop();
            }
            span.add(st.isEmpty() ? i + 1 : i - st.peek());
            st.push(i);
        }
        System.out.println(span.toString());
    }
}
