package StackandQueueHashMap;

import java.util.HashMap;

public class checkDuplicte {
    public static void main(String[] args) {
        int[] arr=  {1,2,3,2,1,4,6,5,7,5,4};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : arr){
            map.put(i, map.getOrDefault(i,0) + 1);
        }

        System.out.println( map.values());

        for(HashMap.Entry <Integer, Integer> i : map.entrySet()){
            if(i. getValue() > 1){
                System.out.println(i.getKey());
            }
        }
    }
}
