class Book {
    private String title;
    private String author;
    private boolean issued;

    private static int totalIssuedBooks = 0;

    
    public Book(String title, String author, boolean issued) {
        this.title = title;
        this.author = author;
        this.issued = issued;

        if (issued) {
            totalIssuedBooks++; // Increment when book is issued
        }
    }

    
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return issued;
    }

    
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIssued(boolean issued) {
        
        if (!this.issued && issued) {
            totalIssuedBooks++;
        } else if (this.issued && !issued) {
            totalIssuedBooks--;
        }
        this.issued = issued;
    }

    public static void showTotalIssued() {
        System.out.println("Total books issued: " + totalIssuedBooks);
    }
}

public class BookHistory {
    public static void main(String[] args) {
        
        Book book1 = new Book("Harry Potter", "J.K. Rowling", true);
        Book book2 = new Book("Five Point Someone", "Chetan Bhagat", false);
        Book book3 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", true);

        
        System.out.println("Book1 issued? " + book1.isIssued());
        System.out.println("Book2 issued? " + book2.isIssued());
        System.out.println("Book3 issued? " + book3.isIssued());

        
        Book.showTotalIssued();
    }
}
