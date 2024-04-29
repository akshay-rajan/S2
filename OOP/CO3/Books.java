// 4. Write a program has class Publisher, Book, Literature and Fiction. Read the information and print the details of books from either the category, using inheritance.


import java.util.Scanner;

public class Books {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Read the Objects and Display them
        Book book = new Book(sc);
        System.out.println(book);

        Literature literature = new Literature(sc);
        System.out.println(literature);

        Fiction fiction = new Fiction(sc);
        System.out.println(fiction);
        
        sc.close();
        
    }
}

class Publisher {
    
    String name;
    String address;

    Publisher(String name, String address) {
        this.name = name;
        this.address = address;
    }
}

class Book {
    
    String title;
    String author;
    Publisher publisher;
    int year;

    // Constructor that reads the data from the user
    Book(Scanner sc) {
        System.out.print("Enter title: ");
        this.title = sc.nextLine();
        System.out.print("Enter author: ");
        this.author = sc.nextLine();
        System.out.print("Enter publisher name: ");
        String publisherName = sc.nextLine();
        System.out.print("Enter publisher address: ");
        String publisherAddress = sc.nextLine();
        this.publisher = new Publisher(publisherName, publisherAddress);
        System.out.print("Enter year: ");
        this.year = sc.nextInt();
        sc.nextLine();
    }

    public String toString() {
        return title + ", by " + author + "\nPublished by " + publisher.name + " (" + year + ")";
    }
}

class Literature extends Book {

    String genre = "Literature";

    Literature(Scanner sc) {
        super(sc);
    }

    @Override
    public String toString() {
        return super.toString() + "\nGenre: " + genre;
    }
}

class Fiction extends Book {

    String genre = "Fiction";

    Fiction(Scanner sc) {
        super(sc);
    }

    @Override
    public String toString() {
        return super.toString() + "\nGenre: " + genre;
    }

}
