package StackandQueueHashMap;

import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "ABCDEF";
        String str2 = "FEDCBF";

        if(str1.length() != str2.length()){
            System.out.println("Not anagram");
        }

        else{
            HashMap<Character, Integer> map1 = new HashMap<>();
            HashMap<Character, Integer> map2 = new HashMap<>();
            for(int i = 0;i<str1.length();i++){
                char ch1 = str1.charAt(i);
                char ch2 = str2.charAt(i);
                map1.put(ch1, map1.getOrDefault(ch1, 0)  +1);
                map2.put(ch2, map2.getOrDefault(ch2, 0)  +1);
            }

            System.out.println(findAnagram(map1,map2));
        }
    }


    public static boolean findAnagram(HashMap<Character, Integer> map1, HashMap<Character, Integer> map2) {
            return map1.equals(map2);
        }
}
