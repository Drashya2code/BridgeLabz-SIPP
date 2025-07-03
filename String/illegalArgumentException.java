package String;

import java.util.Scanner;

public class illegalArgumentException {
    static String text;

    
    public void generateException() {  
        String subStr = text.substring(5, 2);
        System.out.println("Substring is: " + subStr);
    }

    
    public void handleException() {
        try {
            String subStr = text.substring(5, 2);
            System.out.println("Substring is: " + subStr);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        text = sc.nextLine();  
        illegalArgumentException demo = new illegalArgumentException();
        
        System.out.println("Calling method that generates exception:");
        try {
            demo.generateException();
        } catch (Exception e) {
            System.out.println("Exception in first method: " + e.getMessage());
        }

        System.out.println("\nCalling method that handles exception:");
        demo.handleException();
        sc.close();
    }
}
