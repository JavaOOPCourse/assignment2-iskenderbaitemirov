import java.util.Locale;

public class Library {

    private Book[] books;
    private int count;

    public Library() {
        books = new Book[10];
        count = 0;
    }

    // TODO: Add book to array
    public void addBook(Book book) {
        if (count<10){
            this.books[count] = book;
            count+=1;
        }
        else{
            System.out.println("cannot add too many books");
        }
    }

    // TODO: Display all books
    public void displayBooks() {
        for(int i=0;i<count;i++) {
            System.out.println(this.books[i].toString());
        }
        System.out.println("all books above.");
    }

    // TODO: Search book by title
    public Book searchByTitle(String title) {
        for (int i = 0;i<count;i++){
            if (this.books[i].getTitle().equals(title)){
                return this.books[i];
            }
        }
        System.out.println("book not found");
        return null;
    }

    // TODO: Borrow book by title
    public void borrowBook(String title) {
        Book b = searchByTitle(title);
        if (b == null) {
            System.out.println("Book not found");
            return;
        }
        if (!b.isAvailable()) {
            System.out.println("Book not available");
            return;
        }
        b.borrowBook();
        System.out.println("Book borrowed");
    }

    // TODO: Return book by title
    public void returnBook(String title) {
        Book r = searchByTitle(title);
        if (r == null) {
            System.out.println("Book not found");
            return;
        }
        if (r.isAvailable()) {
            System.out.println("Book already available");
            return;
        }
        r.returnBook();
        System.out.println("Book returned");
    }
}
