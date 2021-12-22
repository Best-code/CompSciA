package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class maloneyBook {

    public static void main(String[] args) {
	BookShelf b = new BookShelf();
	b.askToAdd();
    }
}

// if u uncomment and use the book class it can become actually useful although it doesnt save to a real database.


class Book{
    String title;
    String author;
    String genre;
    int pageCount;

    public Book(String title, String author, String genre, int pageCount){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.pageCount = pageCount;
    }
}


class BookShelf{
    Scanner scanner = new Scanner(System.in);
    String answer;

    ArrayList<Book> books = new ArrayList<>();
    //int books = 0;
    boolean bOnce = false;

    Book addBook(){
        System.out.println("Enter the Title of the book: ");
        String title = scanner.nextLine();
        System.out.println("Enter the Author of the book: ");
        String author = scanner.nextLine();
        System.out.println("Enter the Genre of the book: ");
        String genre = scanner.nextLine();
        System.out.println("Enter the Page Count of the book: ");
        int pageCount = scanner.nextInt();
        Book toBeAdded = new Book(title, author, genre, pageCount);
        bOnce = true;
        return toBeAdded;
    }

    /*int addBook(){
        System.out.println("Enter the Title of the book: ");
        String title = scanner.nextLine();
        System.out.println("Enter the Author of the book: ");
        String author = scanner.nextLine();
        System.out.println("Enter the Genre of the book: ");
        String genre = scanner.nextLine();
        System.out.println("Enter the Page Count of the book: ");
        int pageCount = scanner.nextInt();
        bOnce = true;
        return 1;
    }*/

    void askToAdd(){
        if(!bOnce){
            System.out.println("Would you like to add a book to the Book DataBase?\n Yes (y) or No (n)");
            answer = scanner.nextLine();
        }
        else{
            System.out.println("Would you like to add another book to the Book DataBase?\n Yes (y) or No (n)");
            answer = scanner.nextLine();
            answer = scanner.nextLine();

        }

        if (answer.equals("y")) {
            books.add(addBook());
            //books+=addBook();
            askToAdd();
        } else {
            System.out.println(answer);
            System.out.println("Your Book Database now has: " + books.size());
            //System.out.println("Your Book Database now has: " + Integer.toString(books));
        }

    }
}
