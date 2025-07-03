package String;

import java.util.Scanner;

public class convertToLowerCase {
    public static void byASCIIValue(String str){
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                ch[i] = (char) (ch[i] + 32);
            }
        }
        System.out.println(new String(ch));
    }

    public static void byBuiltInFunction(String str){
        str = str.toLowerCase();
        System.out.println(str);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        byASCIIValue(str);

        byBuiltInFunction(str);

        sc.close();
    }
}
