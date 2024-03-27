import model.Book;
import model.Library;
import model.Medium;
import service.SQLConnector;

import javax.print.attribute.standard.Media;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

         /**
         * Task: Create a console based application where the user can manage their media in a library.
         * The user can select between a few options and can borrow a book, removing it from the database, or they can add/return
         * a book, adding it to the database. The user's input can go through the console.
         *
         * TODO: 1. Create constructor, getters and setters for class Book and set it to inherit from class Medium. It should also have title and author and a method that converts the medium to a string
         *       2. In class Library, implement method displayBooks() for printing out the entire list of media
         *       3. In the SQLConnector class there are two empty methods for adding and removing books. Implement them as well
         *       4. After that you can use the SQLConnector class to connect to the database and get a list of all the books/media. Then with that list you can create a Library
         *       5. After that continue with code below to accept user input and process choice
         */

        while (true) {
            System.out.println("1. Display available books");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            // continue with logic that accepts user's input(1-4) and processes it.
        }
    }

}
