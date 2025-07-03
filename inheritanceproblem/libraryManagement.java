package inheritanceproblem;

import java.util.Scanner;

class Author {
    private String name;
    private String bio;

    public Author(String name, String bio) {
        this.name = name;
        this.bio = bio;
    }

    public String getName() {
        return name;
    }

    public String getBio() {
        return bio;
    }
}

class Book {
    private String title;
    private int publicationYear;
    private Author author;

    public Book(String title, int publicationYear, Author author) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.author = author;
    }

    public void displayInfo() {
        System.out.println("Book: " + title);
        System.out.println("Published in: " + publicationYear);
        System.out.println("Author: " + author.getName());
        System.out.println("Bio: " + author.getBio());
    }
}

public class libraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Book name:");
        String bookName = sc.nextLine();
        
        System.out.println("Enter publication Year:");
        int publicationYear = sc.nextInt();
        sc.nextLine(); 
        
        System.out.println("Enter Author name:");
        String authorName = sc.nextLine();
        
        System.out.println("Enter bio:");
        String bio = sc.nextLine();

        Author author = new Author(authorName, bio);
        Book book = new Book(bookName, publicationYear, author);
        
        book.displayInfo();
        sc.close();
    }
}
