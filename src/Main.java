import javax.swing.border.TitledBorder;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        int choice;

        do {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add book");
            System.out.println("2. Add e-book");
            System.out.println("3. Display all books");
            System.out.println("4. Search book by title");
            System.out.println("5. Borrow book");
            System.out.println("6. Return book");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    // TODO: Read input and add Book
                    System.out.print("input Title = ");
                    String Title = scanner.nextLine();
                    System.out.print("input Author = ");
                    String Author = scanner.nextLine();
                    System.out.print("input Year = ");
                    int Year = scanner.nextInt();
                    scanner.nextLine();
                    library.addBook(new Book(Title,Author,Year));
                    System.out.println("book added");
                    break;

                case 2:
                    // TODO: Read input and add EBook
                    System.out.print("input Title = ");
                    String eTitle = scanner.nextLine();
                    System.out.print("input Author = ");
                    String eAuthor = scanner.nextLine();
                    System.out.print("input Year = ");
                    int eYear = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("input filesize = ");
                    double filesize = scanner.nextDouble();
                    scanner.nextLine();
                    library.addBook(new EBook(eTitle,eAuthor,eYear,filesize));
                    System.out.println("ebook added");
                    break;

                case 3:
                    library.displayBooks();
                    break;

                case 4:
                    // TODO: Search book
                    System.out.print("search_for_title: ");
                    String targ = scanner.nextLine();
                    Book found = library.searchByTitle(targ);
                    if (found!=null){
                        System.out.print("found the book:");
                        System.out.println(found.toString());
                    }
                    break;

                case 5:
                    // TODO: Borrow book
                    System.out.print("which title you want to borrow ");
                    String bt = scanner.nextLine();
                    library.borrowBook(bt);
                    break;

                case 6:
                    // TODO: Return book
                    System.out.print("which title you want to return ");
                    String rt = scanner.nextLine();
                    library.returnBook(rt);
                    break;

                case 7:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option!");
            }

        } while (choice != 7);

        scanner.close();
    }
}
