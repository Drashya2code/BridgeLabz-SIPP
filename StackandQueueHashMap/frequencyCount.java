package StackandQueueHashMap;

import java.util.HashMap;

public class frequencyCount {
    public static void main(String[] args) {
        String str = "FEDCBF";
        HashMap<Character, Integer> map1 = new HashMap<>();
        for(char i : str.toCharArray()) {
            map1.put(i, map1.getOrDefault(i, 0) + 1);
        }

        System.out.println(map1.toString());
    }
}
