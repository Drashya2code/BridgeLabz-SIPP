package String;

import java.util.Scanner;

public class StringIndexOutOfBounds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        handleException(str);
        
        generateException(str);
        
        
        
        sc.close();
        }

        
        private static void generateException(String str) {
        System.out.println("\nGenerating exception...");
        System.out.println(str.charAt(str.length() + 1)); 
        }

        
        private static void handleException(String str) {
        System.out.println("\nHandling exception...");
        try {
            System.out.println(str.charAt(str.length() + 1));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println("Cannot access index beyond string length");
        }
    }
}
