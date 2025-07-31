package StackandQueueHashMap;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;;
public class slidingWindow {
    public static void main(String[] args) {
        int arr[] = {1,3,-1,-3,5,3,6,7}; 
        int Wsize = 3;
        ArrayList<Integer> al = max(arr,Wsize);
        System.out.println(al.toString());
        }

    private static ArrayList<Integer> max(int[] arr, int k) {
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();

        for(int i = 0;i<k;i++){
            while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]){
                dq.pollLast();
            }
            dq.addLast(i);
        }

        for(int i = k;i<n;i++){
            res.add((arr[dq.peekFirst()]));

            while(!dq.isEmpty()&& dq.peekFirst() <= i - k){
                dq.pollFirst();
            }

            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.pollLast();
            }
            dq.addLast(i);;
        }

        res.add(arr[dq.peekFirst()]);

        return res;
    }

        
}
