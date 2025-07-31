package Collections;

import java.util.ArrayList;
import java.util.List;

public class reverseList {
    public static void main(String[] args) {

        // by ArrayList
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.size());
        for(int i = 0; i < list.size()/2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(list.size() - i - 1));
            list.set(list.size() - i - 1, temp);
        }

        System.out.println(list.toString());
    }
}
