package practiceProblem;

class Book{
    String title;
    String author;
    int price;

    // constructor
    Book(){
        title="Chemistry";
        author="S.chand";
        price = 249;
    }

    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayBookDetails(){
        System.out.println("Title " + title + " Author " + author + "price "+ price);
    }
}

public class bookSystem {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayBookDetails();

        Book book2 = new Book("Prem Chandra","Prem Chandra", 230);
        book2.displayBookDetails();
    }
}
