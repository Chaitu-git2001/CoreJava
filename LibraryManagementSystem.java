import java.util.ArrayList;
import java.util.List;

class Book {
    private int bookId;
    private String title;
    private String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    
    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}


interface Notifyable {
    void sendNotification(String message);
}


abstract class LibraryMember implements Notifyable {
    protected int memberId;
    protected String name;
    protected List<Book> borrowedBooks = new ArrayList<>();

    public LibraryMember(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    public abstract void borrowBook(Book book);

    public int getBorrowedCount() {
        return borrowedBooks.size();
    }

    public String getName() {
        return name;
    }
}
class StudentMember extends LibraryMember {
    private static final int MAX_BOOKS = 3;

    public StudentMember(int memberId, String name) {
        super(memberId, name);
    }

    @Override
    public void borrowBook(Book book) {
        if (borrowedBooks.size() < MAX_BOOKS) {
            borrowedBooks.add(book);
        } else {
            System.out.println("Student cannot borrow more than " + MAX_BOOKS + " books.");
        }
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Notification sent to " + name + ": " + message);
    }
}


class FacultyMember extends LibraryMember {
    private static final int MAX_BOOKS = 5;

    public FacultyMember(int memberId, String name) {
        super(memberId, name);
    }

    @Override
    public void borrowBook(Book book) {
        if (borrowedBooks.size() < MAX_BOOKS) {
            borrowedBooks.add(book);
        } else {
            System.out.println("Faculty cannot borrow more than " + MAX_BOOKS + " books.");
        }
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Notification sent to " + name + ": " + message);
    }
}


public class LibraryManagementSystem {
    public static void main(String[] args) {
        
        Book b1 = new Book(1, "Java Programming", "James Gosling");
        Book b2 = new Book(2, "Database Systems", "Elmasri");
        Book b3 = new Book(3, "Operating Systems", "Galvin");
        Book b4 = new Book(4, "Data Structures", "Mark Weiss");
        Book b5 = new Book(5, "Artificial Intelligence", "Stuart Russell");

        
        LibraryMember student = new StudentMember(101, "Amit");
        LibraryMember faculty = new FacultyMember(201, "Prof. Singh");

        
        student.borrowBook(b1);
        student.borrowBook(b2);

        
        faculty.borrowBook(b1);
        faculty.borrowBook(b2);
        faculty.borrowBook(b3);
        faculty.borrowBook(b4);

        
        System.out.println("StudentMember " + student.getName() + " borrowed " + student.getBorrowedCount() + " books");
        System.out.println("FacultyMember " + faculty.getName() + " borrowed " + faculty.getBorrowedCount() + " books");

        
        student.sendNotification("Return books within 7 days");
        faculty.sendNotification("Return books within 14 days");
    }
}
