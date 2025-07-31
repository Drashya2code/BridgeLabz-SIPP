package StackandQueueHashMap;

import java.util.HashMap;

public class firstnonrepeating {
    public static void main(String[] args) {
        String str = "ABCDEFCXXD";
        HashMap<Character, Integer> map  = new HashMap<>();
        for(char i : str.toCharArray()){
            map.put(i,map.getOrDefault(i, 0)  + 1);
        }

        for(HashMap.Entry<Character,Integer> i : map.entrySet()){
            if(i.getValue() < 2){
             System.out.println(i.getKey());
            }else{
                break;
            }
        }
    }
}
