package String;
import java.util.*;

public class nullPointException {
    
    public static void generateNullPointer() {
        String text = null;
        System.out.println("Length of text: " + text.length());
    }

    public static void handleNullPointer() {
        String text = null;
        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Demonstrating NullPointerException:");
        
        System.out.println("\n1. Generating exception:");
        try {
            generateNullPointer();
        } catch (NullPointerException e) {
            System.out.println("Main caught exception: " + e);
        }
        
        System.out.println("\n2. Handling exception:");
        handleNullPointer();
    }
}
