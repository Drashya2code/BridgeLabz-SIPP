package assignment;

import java.util.*;
class Book{
	ArrayList<String> books = new ArrayList<>();
	
	void addBook(String title, String Author) {
		books.add(title + "-" + Author);
		sortByLength();
	}
	
	void sortByLength() {
		for(int i = 0;i<books.size();i++){
			for(int j = i + 1; j<books.size();j++) {
				if(books.get(j).length() < books.get(i).length()) {
					String temp = books.get(i);
					books.add(i,books.get(i));
					books.add(j,temp);
				}
			}
		}
	}
	
	void searchByAuthor(String author) {
		for(String book : books) {
			String[] temp = book.split("-");
			
			if(temp[1].equals(author)) {
				System.out.println(book);
			}else if(temp[0].equals(author)) {
				System.out.println(book);
			}
			else {
				System.out.println("Write Correct Author Name!!");
			}
		}
	}
}

public class bookSelf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Store Book Details");
		System.out.println("Enter no. of to be Stored");
		Book book = new Book();
		int noOfBook = sc.nextInt();
		while(noOfBook-- >0) {
			System.out.println("Enter Book Name");
			String bookName = sc.nextLine();
			sc.nextLine();
			System.out.println("Enter Author Name");
			String authorName = sc.nextLine();
			book.addBook(bookName, authorName.toLowerCase());
		}
		
		System.out.println("Find Book by Author Name");
		
		System.out.println("Enter Author Name");
		String author = sc.nextLine();
		book.searchByAuthor(author.toLowerCase());
		
		sc.close();		
		
	}
}
